package com.dixn.spring.cloud.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.internal.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
@EnableDiscoveryClient
@EnableEurekaClient
public class SpringCloudZipkinApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudZipkinApplication.class, args);
    }
}
