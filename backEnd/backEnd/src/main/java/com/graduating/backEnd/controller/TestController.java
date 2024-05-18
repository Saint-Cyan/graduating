package com.graduating.backEnd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: backEnd
 * @description: test
 * @author: Cyan
 * @create: 2024-04-18 23:31
 **/
@RestController
public class TestController {

    @GetMapping("/hello")
    public String hello(){

        return "Hello This is a test!";
    }
}
