package com.service.micro.controller;

import com.service.micro.entity.UserDetails;
import com.service.micro.entity.UsersInfo;
import com.service.micro.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserInfoService userInfoService;
    @GetMapping("/get")
    public UsersInfo getUser(){

       return userInfoService.getDetails();

    }
    @PostMapping("/post")
    public void post(@RequestBody UserDetails userDetails){

        System.out.println(userDetails);
    }

}
