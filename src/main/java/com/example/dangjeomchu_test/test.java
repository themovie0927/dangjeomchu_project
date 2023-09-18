package com.example.dangjeomchu_test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/test")
    public String test() {
        return "Hello, world!";
    }
}