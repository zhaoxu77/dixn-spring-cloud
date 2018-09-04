package com.dixn.spring.cloud.service.feign.config;

import com.dixn.spring.cloud.service.feign.service.ProcessFeignService;
import org.springframework.stereotype.Component;

/**
 * ${DESCRIPTION}
 *
 * @author
 * @create 2018-09-04 14:44
 **/
@Component
public class PorcessServiceHiHystric implements ProcessFeignService {
    @Override
    public String processFeignService() {
        return "sorry I am feign hystric ";
    }
}
