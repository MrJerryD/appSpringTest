package org.example.spring.newfirstappspring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class Car implements Vehicle {

    public Car() {
        System.out.println("Car BEAN constructor is created");
    }

    @Override
    public void startEngine() {
        System.out.println("car is running");
    }
}