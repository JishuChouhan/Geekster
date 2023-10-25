package com.example.Mail.Integration;

import org.springframework.context.annotation.Bean;
@org.springframework.context.annotation.Configuration
public class Configuration {
    @Bean
    public MyObject myObject(){
        String name = "Jishu";
        int age = 23;
        return new MyObject(name,age);
    }
}
