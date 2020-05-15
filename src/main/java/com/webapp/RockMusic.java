package com.webapp;

import org.springframework.stereotype.Component;

@Component
public class RockMusic implements MusicPlayer{
    private String music = "Rammstein";
    @Override
    public void playSong() {
        System.out.print("Is now playing " + music);
    }
}
