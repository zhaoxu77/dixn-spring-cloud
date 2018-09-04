package com.dixn.spring.cloud.service.process;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudServiceProcessApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudServiceProcessApplication.class, args);
    }
}
