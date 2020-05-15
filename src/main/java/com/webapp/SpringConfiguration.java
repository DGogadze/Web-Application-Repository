package com.webapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.webapp")
public class SpringConfiguration{
    @Bean
    public RockMusic rockMusic(){
        return new RockMusic();
    }
    @Bean
    public ClassicalMusic classicalMusic(){
        return new ClassicalMusic();
    }
    @Bean
    public Computer computer(){
        return new Computer(rockMusic(),classicalMusic());
    }
}