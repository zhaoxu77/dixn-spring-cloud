package com.dixn.spring.cloud.service.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableEurekaClient // 配置本应用将使用服务注册和服务发现
@EnableHystrixDashboard // 开启dashboard，通过图形化的方式监控: 查看 http://127.0.0.1:12082/hystrix.stream
//@EnableCircuitBreaker // 启动断路器，如果要监控hystrix的流必须开启此注解，即使fegin已经通过属性
public class SpringCloudServiceFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudServiceFeignApplication.class, args);
    }
}
