package com.example.myapp.controller;

import com.example.myapp.entity.Hello;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {

    @GetMapping("/hello")
    public Hello getHello() {
        log.info("GET /hello endpoint called");
        Hello response = Hello.builder()
                              .name("World")
                              .message("Hello, World!")
                              .build();
        log.info("Response: {}", response);
        return response;
    }
}