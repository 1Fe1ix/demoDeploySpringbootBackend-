package com.test.demo.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestAppController {

    
    @GetMapping("/hello")
    public String testApi(){
        return "Hello, World!";
    }
}
