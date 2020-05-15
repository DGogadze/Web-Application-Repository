package com.webapp;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements MusicPlayer{
    private String music = "Lunar sonata";
    @Override
    public void playSong() {
        System.out.print("Is now playing " + music);
    }
}
