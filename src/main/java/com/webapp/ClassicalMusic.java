package com.webapp;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic {
    private String musicName = "Lunar Sonata";

    public String getMusicName() {
        return musicName;
    }
}
