package com.example.monsterhunterserver;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String index(){
        return "Greeting!";
    }

    @GetMapping ("/hello")
    public String hello() {
        return "Hello World";
    }
}
