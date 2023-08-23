package com.sailing.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;


@Configuration
@ImportResource(locations= {"classpath:generatorConfig.xml","classpath:mybatis-config.xml","classpath:spring-config.xml"})

public class MVCConfig {

}