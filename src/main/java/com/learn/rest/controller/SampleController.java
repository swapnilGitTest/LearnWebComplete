/*
 * Copyright (c) 2019 The Spring Boot Learning Project
 */

package com.learn.rest.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/TestController")
@Api(value = "Test Controller", description = "Test controller description")
public class SampleController {

    @RequestMapping("/method")
    @ApiOperation(value = "method of test")
    public void test() {
        System.out.println("Test Method");
    }
}
