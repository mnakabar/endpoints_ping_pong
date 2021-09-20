package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NossoControllers {


    @ResponseBody
    @GetMapping("/ping")
    public String ping (){
        return " novo pong";
    }
    @ResponseBody
    @GetMapping("/mais-ping" )
    public String maisPong(){
        return "mais um novo pong";
    }
}
