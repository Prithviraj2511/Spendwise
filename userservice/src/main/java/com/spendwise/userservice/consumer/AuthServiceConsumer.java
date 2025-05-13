package com.spendwise.userservice.consumer;

import com.spendwise.userservice.entities.UserInfo;
import com.spendwise.userservice.entities.UserInfoDto;
import com.spendwise.userservice.repository.UserRepository;
import com.spendwise.userservice.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceConsumer {

    private UserService userService;

    @Autowired
    public AuthServiceConsumer(UserService userService) {
        this.userService = userService;
    }

    @KafkaListener(topics = "${spring.kafka.topic.name}",groupId = "${spring.kafka.consumer.group-id}")
    public void listner(UserInfoDto eventData){
         try{
             userService.createOrUpdateUser(eventData);
        }catch(Exception ex){
            ex.printStackTrace();
            System.out.println("AuthServiceConsumer: Exception is thrown while consuming kafka event");
        }
    }
}
