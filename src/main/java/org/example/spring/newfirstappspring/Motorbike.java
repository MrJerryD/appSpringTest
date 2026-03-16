package org.example.spring.newfirstappspring;

import org.springframework.stereotype.Component;


public class Motorbike implements Vehicle {

    public Motorbike() {
        System.out.println("Motorbike BEAN constructor is created");
    }

    @Override
    public void startEngine() {
        System.out.println("motorbike is running");
    }
}
