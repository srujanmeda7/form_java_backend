package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class Hello {
    
    @RequestMapping("/")
    public String greet(){
        return "JESUS CHRIST OF NAZARATH";
    }
}
