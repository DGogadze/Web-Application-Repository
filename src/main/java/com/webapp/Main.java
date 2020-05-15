package com.webapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("context.xml");
        Computer computer = context.getBean("computer",Computer.class);
        computer.compute();
        context.close();
    }
}
