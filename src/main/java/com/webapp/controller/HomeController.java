package com.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("")
    public String indexPage(){
        return "home/homePage";
    }

    @GetMapping("/home")
    public String homePage() {
        return "home/homePage";
    }

    @GetMapping("/exit")
    public String exitPage(){
        return "home/exitPage";
    }
}