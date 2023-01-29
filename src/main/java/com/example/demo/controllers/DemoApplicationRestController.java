package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoApplicationRestController {

    @GetMapping("/demo")
    public String helloWorld(){
        return String.format("{Timestamp:%s}", System.currentTimeMillis());
    }

}
