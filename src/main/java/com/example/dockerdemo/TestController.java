package com.example.dockerdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/")
    public String home() {
        return "Spring Boot application is running successfully!";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello from Docker!";
    }

    @GetMapping("/health")
    public String health() {
        return "Application is healthy!";
    }
}

