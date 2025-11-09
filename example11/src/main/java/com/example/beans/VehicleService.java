package com.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class VehicleService {
    @Autowired
    private Speakers speaker;
    @Autowired
    private Tyres tyre;

    public VehicleService(){
        System.out.println("Vehicle services initialized!");
    }

    public void playMusic(){
        speaker.makeSound();
    }

    public void move(){
        tyre.rotate();
    }
}
