package com.webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Computer implements MusicPlayer{
    private int computerId=5625;
    private RockMusic rockMusic;
    private ClassicalMusic classicalMusic;

    @Autowired
    Computer(RockMusic rockMusic,ClassicalMusic classicalMusic){
        this.rockMusic=rockMusic;
        this.classicalMusic=classicalMusic;
    }

    @Override
    public void playSong() {
        System.out.println("Computer " + computerId + " is now playing " + rockMusic.getMusicName());
        System.out.println("Computer " + ++computerId + " is now playing " + classicalMusic.getMusicName());
    }
}
