package com.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
@EnableFeignClients
public class BorrowApplication {
    static void main(String[] args) {
        SpringApplication.run(BorrowApplication.class, args);
    }
}
