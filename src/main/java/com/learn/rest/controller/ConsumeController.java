/*
 * Copyright (c) 2019 The Spring Boot Learning Project
 */

package com.learn.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/consume")
public class ConsumeController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping(value = "/get", produces = MediaType.APPLICATION_JSON_UTF8_VALUE, method = RequestMethod.GET)
    public ResponseEntity<String> get() {
        String data=restTemplate.getForObject("http://dummy.restapiexample.com/api/v1/employees", String.class);
        System.out.println("Data :: "+data);
        return new ResponseEntity<String>(data,HttpStatus.OK);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
