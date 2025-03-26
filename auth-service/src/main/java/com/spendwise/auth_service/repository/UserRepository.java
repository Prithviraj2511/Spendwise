package com.spendwise.auth_service.repository;

import com.spendwise.auth_service.entities.UserInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserInfo, Long> {

    UserInfo findByUsername(String username);

}
