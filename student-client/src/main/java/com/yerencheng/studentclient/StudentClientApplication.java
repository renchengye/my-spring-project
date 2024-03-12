package com.yerencheng.studentclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker
public class StudentClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(StudentClientApplication.class, args);
    }
}
