package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class Sony implements Speakers{
    @Override
    public void makeSound() {
        System.out.println("Sony making sound");
    }
}
