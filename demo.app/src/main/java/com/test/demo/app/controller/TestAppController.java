package com.test.demo.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.test.demo.app.service.TestAppService;
import com.test.demo.app.entity.Item;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/test")
public class TestAppController {

    @Autowired
    TestAppService testAppService;
    
    @GetMapping("/hello")
    public List<Item> testApi(){
        List<Item> items = testAppService.getAllItems();
        System.out.println("Items fetched: " + items.size());
        return items;
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
