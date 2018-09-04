package com.dixn.spring.cloud.service.feign.service;

import com.dixn.spring.cloud.service.feign.config.PorcessServiceHiHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * ${DESCRIPTION}
 *
 * @author
 * @create 2018-09-04 14:21
 **/
@FeignClient(value = "service-prcess", fallback = PorcessServiceHiHystric.class)
public interface ProcessFeignService {
    @RequestMapping(value = "/process",method = RequestMethod.GET)
    String processFeignService();
}
