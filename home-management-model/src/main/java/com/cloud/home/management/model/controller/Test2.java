package com.cloud.home.management.model.controller;

import com.cloud.home.management.model.dao.user.UserRepository;
import com.cloud.home.management.model.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "user")
public class Test2 {

    @Autowired
    UserRepository userRepository;

    @GetMapping(value = "test")
    public List<UserEntity> test(@RequestParam String name){
        System.out.println("接收获取参数:"+ name);
        List<UserEntity> userEntityList = userRepository.findAll();
        return userEntityList;
    }
}
