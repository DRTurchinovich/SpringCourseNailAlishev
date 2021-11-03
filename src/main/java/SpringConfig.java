package com.example.demo.spring;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan("com.example.demo.spring")
@PropertySource("classpath:musicPlayer.propertie")
public class SpringConfig {

}
