package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoApplicationRestController {

    @GetMapping("/")
    public String root(){
        return String.format("{Version:%s, Timestamp:%s}", "1.0", System.currentTimeMillis());
    }
    
    @GetMapping("/demo")
    public String demo(){
        return String.format("{Timestamp:%s}", System.currentTimeMillis());
    }

}
