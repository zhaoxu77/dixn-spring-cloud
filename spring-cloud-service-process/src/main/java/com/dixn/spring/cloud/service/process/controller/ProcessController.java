package com.dixn.spring.cloud.service.process.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ${DESCRIPTION}
 *
 * @author
 * @create 2018-09-04 13:34
 **/
@RestController
public class ProcessController {
    @Value("${server.port}")
    String port;

    @RequestMapping("/process")
    public String process() {
        return "hi " + ",i am from port:" + port;
    }
}
