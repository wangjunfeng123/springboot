package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${com.springboot.author}")
    private String name;

    @RequestMapping("hello")
    public String index() {
        return "hello world"+name;
    }
}