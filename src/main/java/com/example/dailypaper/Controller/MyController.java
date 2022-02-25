package com.example.dailypaper.Controller;

import org.springframework.web.bind.annotation.GetMapping;

public class MyController {

    @GetMapping("/")
    public String article(){
        return "article";
    }
}
