package com.sailing;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan("com.sailing.dao")
@ComponentScan(basePackages = {"com.*"})//扫描别的包内的结构
//@ServletComponentScan(basePackages = "com.se.code")
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}