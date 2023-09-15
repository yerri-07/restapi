package com.service.micro.service;

import com.service.micro.entity.UserEntity;
import com.service.micro.entity.UsersInfo;
import com.service.micro.repository.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserInfoService {


    @Autowired
    private UsersInfo user;
    @Autowired
    private UserInfoRepository repo;
    public UsersInfo getDetails(){

        String name;
        Optional<UserEntity> userResponse = repo.findById(1);

         UserEntity userEntity = userResponse.get();

         user.setUsername(userEntity.getUsername());

        return user;
    }

}
