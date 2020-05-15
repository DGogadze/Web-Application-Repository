package com.webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Computer {
    private MusicPlayer musicPlayer;
    private MusicPlayer musicPlayerClassic;
    @Autowired
    Computer(@Qualifier("rockMusic") MusicPlayer musicPlayer,@Qualifier("classicalMusic") MusicPlayer musicPlayerClassic){
        this.musicPlayer = musicPlayer;
        this.musicPlayerClassic = musicPlayerClassic;
    }
    void compute(){
        musicPlayer.playSong();
        System.out.println("");
        musicPlayerClassic.playSong();
    }
}