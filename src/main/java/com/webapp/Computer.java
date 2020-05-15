package com.webapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope("singleton")
public class Computer {
    @Value("${computer.compId}")
    private int id;
    private MusicPlayer musicPlayer;
    private MusicPlayer musicPlayerClassic;
    @Autowired
    Computer(@Qualifier("rockMusic") MusicPlayer musicPlayer,@Qualifier("classicalMusic") MusicPlayer musicPlayerClassic){
        this.musicPlayer = musicPlayer;
        this.musicPlayerClassic = musicPlayerClassic;
    }

    public void setId(int id) {
        this.id = id;
    }

    void compute(){
        System.out.println("It's computer " + id);
        musicPlayer.playSong();
        System.out.println("");
        musicPlayerClassic.playSong();
        System.out.println();
    }

    @PostConstruct
    private void postConstr(){
        System.out.println("Class constructed " + Computer.class.toString());
    }

    @Override
    public String toString() {
        return Computer.class.getName();
    }

    @PreDestroy
    private void preDestr(){
        System.out.println("Class destroyed" + Computer.class.toString());
    }
}