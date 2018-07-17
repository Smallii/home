package com.cloud.home.management.model;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class HomeManagementModelApplication {

    public static void main(String[] args) {
        SpringApplication.run(HomeManagementModelApplication.class, args);
    }
}
