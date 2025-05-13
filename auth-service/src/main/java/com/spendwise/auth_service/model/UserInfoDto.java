package com.spendwise.auth_service.model;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import com.spendwise.auth_service.entities.UserInfo;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class UserInfoDto extends UserInfo
{

    @NonNull
    private String firstName;

    @NonNull
    private String lastName;

    @NonNull
    private Long phoneNumber;

    @NonNull
    private String email;


}
