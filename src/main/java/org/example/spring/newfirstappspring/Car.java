package org.example.spring.newfirstappspring;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("car is running");
    }
}