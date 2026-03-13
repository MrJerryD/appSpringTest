package org.example.spring.newfirstappspring;

import org.springframework.stereotype.Component;

@Component
public class Motorbike implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("motorbike is running");
    }
}
