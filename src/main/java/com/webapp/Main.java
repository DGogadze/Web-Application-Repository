package com.webapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new
                AnnotationConfigApplicationContext(SpringConfiguration.class);
        Computer computer = context.getBean("computer",Computer.class);
        computer.compute();
    }
}
