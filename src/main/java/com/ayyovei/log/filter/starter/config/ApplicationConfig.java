package com.ayyovei.log.filter.starter.config;

import com.ayyovei.log.filter.starter.filter.HelloFilter;
import com.ayyovei.log.filter.starter.filter.LogFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.servlet.Filter;

/**
 * @author chenxiaobin
 * @description
 * @create 2019/6/16
 */
@Configuration
public class ApplicationConfig {
   @Bean
    public FilterRegistrationBean logfilter() {
        FilterRegistrationBean filterFilterRegistrationBean = new FilterRegistrationBean();
        filterFilterRegistrationBean.setFilter(new LogFilter());
        filterFilterRegistrationBean.addUrlPatterns("/*");
        filterFilterRegistrationBean.setName("logFilter");
        filterFilterRegistrationBean.setOrder(1);
        return filterFilterRegistrationBean;
    }



}
