package com.dixn.spring.cloud.service.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * ${DESCRIPTION}
 *
 * @author
 * @create 2018-09-04 11:51
 **/
@RestController
public class adminController {

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String index() {
        return "hello admin:" + port;
    }
}
