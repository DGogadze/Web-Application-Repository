package com.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

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

    @GetMapping("/sayHello")
    public String sayHelloPage(@RequestParam(value = "name",required = false) String name,
                               @RequestParam(value = "surname",required = false) String surname){
        return "home/sayHelloPage";
    }
}