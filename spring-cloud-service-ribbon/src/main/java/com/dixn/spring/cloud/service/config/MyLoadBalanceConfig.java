package com.dixn.spring.cloud.service.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ${DESCRIPTION}
 *
 * @author
 * @create 2018-09-05 21:34
 **/
@Configuration
public class MyLoadBalanceConfig {
    @Bean
    public IRule ribbonRule() { // 其中IRule就是所有规则的标准  RoundRobinRule(轮询算法)
        return new RandomRule();

    }
}
