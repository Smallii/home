package com.cloud.home.management.service.controller;

import com.alibaba.fastjson.JSONObject;
import com.cloud.home.management.service.entity.User;
import com.cloud.home.management.service.service.Test2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Test1 {

    @Autowired
    Test2 test2;

    @GetMapping(value = "test")
    public JSONObject test(@RequestParam String name){
        JSONObject jsonObject = new JSONObject();
        System.out.println("发送请求参数:"+ name);
        List<User> userList = test2.sayHiFromClientOne(name);
        jsonObject.put("userList", userList);
        return jsonObject;
    }
}
