package com.devops.Devops;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ResourceAPI {

    @GetMapping(value = "get")
    public String hello(){
        return "Welcome to spring Boot";
    }
}
