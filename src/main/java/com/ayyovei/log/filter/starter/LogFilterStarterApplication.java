package com.ayyovei.log.filter.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@ServletComponentScan
public class LogFilterStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(LogFilterStarterApplication.class, args);
    }

    @RequestMapping("/hello")
    public String hello(){
        return "hello filter log";
    }
}
