package org.example.spring.newfirstappspring;

import org.springframework.stereotype.Component;


public class Car implements Vehicle {

    public Car() {
        System.out.println("Car BEAN constructor is created");
    }

    @Override
    public void startEngine() {
        System.out.println("car is running");
    }
}