package com.spendwise.auth_service.repository;

import com.spendwise.auth_service.entities.RefreshToken;
import com.spendwise.auth_service.entities.UserInfo;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Repository
public interface RefreshTokenRepository extends CrudRepository<RefreshToken,Integer> {
    Optional<RefreshToken> findByToken(String token);

    @Modifying
    @Transactional
    void deleteByUserInfo(UserInfo userInfo);
}
