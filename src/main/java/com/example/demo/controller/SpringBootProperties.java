package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author wangjunfeng
 * @version 1.0
 * @desc The type Sale menu service.
 * @since ${date}
 */
@Component
public class SpringBootProperties {

    @Value("${com.springboot.author}")
    public static String name;

    @Value("${com.springboot.date}")
    public static Date date;
}