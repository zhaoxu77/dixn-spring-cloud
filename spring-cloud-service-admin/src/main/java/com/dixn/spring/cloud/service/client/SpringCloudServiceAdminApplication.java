package com.dixn.spring.cloud.service.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudServiceAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudServiceAdminApplication.class, args);
    }
}
