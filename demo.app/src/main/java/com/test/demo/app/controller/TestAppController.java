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

    @GetMapping("/mami")
    public String testApi2(){
        return "Mami, ich hab dich lieb";
    }

    @GetMapping("/dani")
    public String testApi3(){
        return "My love, te extraño mucho y te amo con todo mi corazón";
    }

    @GetMapping("/kimi")
    public String testApi4(){
        return "Kimi, ich hab dich lieb";
    }

    @GetMapping("/papi")
    public String testApi5(){
        return "Papi, ich hab dich lieb";
    }
}
