package com.dixn.spring.cloud.service.feign.controller;

import com.dixn.spring.cloud.service.feign.service.ProcessFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ${DESCRIPTION}
 *
 * @author
 * @create 2018-09-04 14:23
 **/
@RestController
public class ProcessFeignController {
    @Autowired
    ProcessFeignService processFeignService;

    @GetMapping(value = "/processFeign")
    public String processFeign() {
        return processFeignService.processFeignService();
    }
}
