package com.example.beans;

import org.springframework.stereotype.Component;

@Component
public class Michelin implements Tyres{
    public void rotate(){
        System.out.println("Michelin tyre is rotating!");
    }
}
