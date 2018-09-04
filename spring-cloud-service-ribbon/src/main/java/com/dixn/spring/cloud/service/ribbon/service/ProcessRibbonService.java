package com.dixn.spring.cloud.service.ribbon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * ${DESCRIPTION}
 *
 * @author
 * @create 2018-09-04 14:06
 **/
@Service
public class ProcessRibbonService {
    @Autowired
    RestTemplate restTemplate;

    public String processService() {
        return restTemplate.getForObject("http://SERVICE-PRCESS/process",String.class);
    }
}
