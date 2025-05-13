package com.spendwise.userservice.service;

import com.spendwise.userservice.entities.UserInfo;
import com.spendwise.userservice.entities.UserInfoDto;
import com.spendwise.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserInfoDto createOrUpdateUser(UserInfoDto userInfoDto) {
        UnaryOperator<UserInfo> updatingUser = user -> {
            user.setEmail(userInfoDto.getEmail());
            user.setFirstName(userInfoDto.getFirstName());
            user.setLastName(userInfoDto.getLastName());
            user.setPhoneNumber(userInfoDto.getPhoneNumber());
            return userRepository.save(user);
        };
        Supplier<UserInfo> createUser = () ->
                userRepository.save(userInfoDto.transformToUserInfo());

        UserInfo userInfo = userRepository.findByUserId(userInfoDto.getUserId())
                .map(updatingUser)
                .orElseGet(createUser);

        return new UserInfoDto(
                userInfo.getUserId(),
                userInfo.getFirstName(),
                userInfo.getLastName(),
                userInfo.getPhoneNumber(),
                userInfo.getEmail(),
                userInfo.getProfilePic()
        );
    }

    public UserInfoDto getUser(UserInfoDto userInfoDto) throws Exception{
        Optional<UserInfo> userInfoDtoOpt = userRepository.findByUserId(userInfoDto.getUserId());
        if(userInfoDtoOpt.isEmpty()){
            throw new Exception("User not found");
        }
        UserInfo userInfo = userInfoDtoOpt.get();
        return new UserInfoDto(
                userInfo.getUserId(),
                userInfo.getFirstName(),
                userInfo.getLastName(),
                userInfo.getPhoneNumber(),
                userInfo.getEmail(),
                userInfo.getProfilePic()
        );
    }
}
