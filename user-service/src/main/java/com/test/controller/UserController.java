package com.test.controller;

import com.test.entity.User;
import com.test.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class UserController {

    @Resource
    UserService service;

    @Value("${test.wx}")
    String test;

    @RequestMapping("/user/{uid}")
    public User findUserById(@PathVariable("uid") int uid){
        System.out.println(test);
        return service.getUserById(uid);
    }
}
