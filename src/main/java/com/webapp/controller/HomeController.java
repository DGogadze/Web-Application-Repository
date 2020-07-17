package com.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
                               @RequestParam(value = "surname",required = false) String surname,
                               Model model){
        model.addAttribute("message","Hello, " + name + " " + surname);
        return "home/sayHelloPage";
    }
    @GetMapping("/calculator")
    public String calculatorPage(@RequestParam("x") int x,
                                 @RequestParam("y") int y,
                                 @RequestParam("action") String action,
                                 Model model){

        double result = 0;
        String resultString = "Cannot divide to 0";
        switch (action) {
            case "multiply":
                result=x*y;
                break;
            case "divide":
                try {
                    result=x/(double)y;
                } catch (ArithmeticException ignored){

                }
                break;
            case "subtraction":
                    result = x-y;
                    break;
            case "addiction":
                result=x+y;
                break;
        }
        model.addAttribute("result",result);
        return "home/calculatorPage";
    }
}