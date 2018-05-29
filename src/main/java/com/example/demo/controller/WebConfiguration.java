package com.example.demo.controller;

import org.apache.catalina.filters.RemoteIpFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * 配置自定义过滤器类
 * author：wangjunfeng
 */
@Configuration
public class WebConfiguration {

    @Bean
    public RemoteIpFilter remoteIpFilter() {
        return new RemoteIpFilter();
    }

    @Bean
    public FilterRegistrationBean testFilterRegistration() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(new MyFilter());
        registrationBean.addUrlPatterns("/*");
        Map<String, String> param = new HashMap<String, String>();
        param.put("paramName", "paramValue");
        registrationBean.setInitParameters(param);
        registrationBean.setName("my-filter");
        registrationBean.setOrder(1);

        return registrationBean;
    }
}

