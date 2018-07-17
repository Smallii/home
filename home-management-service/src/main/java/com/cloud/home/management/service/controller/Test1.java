package com.cloud.home.management.service.controller;

import com.cloud.home.management.service.service.Test2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test1 {
    @Autowired
    Test2 test2;
    @GetMapping(value = "test")
    public String test(@RequestParam String name){
        return test2.sayHiFromClientOne(name);
    }
}
