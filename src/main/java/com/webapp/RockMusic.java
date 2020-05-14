package com.webapp;

import org.springframework.stereotype.Component;

@Component
public class RockMusic{
    private String musicName = "Rammstein";

    public String getMusicName() {
        return musicName;
    }
}
