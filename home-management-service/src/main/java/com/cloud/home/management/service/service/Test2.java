package com.cloud.home.management.service.service;

import com.cloud.home.management.service.entity.User;
import com.cloud.home.management.service.service.fallback.Test2Fallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
@FeignClient(value = "home-management-model", fallback = Test2Fallback.class)
public interface Test2 {

    @RequestMapping(value = "/user/test",method = RequestMethod.GET)
    List<User> sayHiFromClientOne(@RequestParam(value = "name") String name);
}
