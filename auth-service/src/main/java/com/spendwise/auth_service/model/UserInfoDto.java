package com.spendwise.auth_service.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.spendwise.auth_service.entities.UserInfo;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class UserInfoDto extends UserInfo
{

    //first_name
    private String firstName;

    private String lastName;

    private Long phoneNumber;

    private String email;


}
