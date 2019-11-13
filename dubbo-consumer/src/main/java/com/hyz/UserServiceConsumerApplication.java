package com.hyz;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class UserServiceConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(UserServiceConsumerApplication.class, args);
    }
}
