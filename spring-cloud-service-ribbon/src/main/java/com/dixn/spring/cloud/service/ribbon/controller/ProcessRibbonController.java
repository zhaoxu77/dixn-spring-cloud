package com.dixn.spring.cloud.service.ribbon.controller;

import com.dixn.spring.cloud.service.ribbon.service.ProcessRibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ${DESCRIPTION}
 *
 * @author
 * @create 2018-09-04 14:08
 **/
@RestController
public class ProcessRibbonController {
    @Autowired
    ProcessRibbonService processRibbonService;

    @GetMapping(value = "/processRibbon")
    public String processRibbon() {
        return processRibbonService.processService();
    }
}
