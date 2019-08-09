package com.learn.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RestController;

/**
 * Main classs for the spring boot app
 */
@RestController
@EnableAutoConfiguration
public class BootMainLoader {
    public static void main(String[] args) {
        System.out.println("Hello Boot...!");
        SpringApplication.run(BootMainLoader.class, args);
    }
}
