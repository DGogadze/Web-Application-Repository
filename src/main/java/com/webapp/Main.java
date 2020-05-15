package com.webapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new
                ClassPathXmlApplicationContext("context.xml");
        Computer computer = context.getBean("computer",Computer.class);
        Computer computer1 = context.getBean("computer",Computer.class);
        computer1.setId(55);
        computer1.compute();
        computer.compute();
        context.close();
    }
}
