package com.cloud.home.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class HomeEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(HomeEurekaApplication.class, args);
    }
}
