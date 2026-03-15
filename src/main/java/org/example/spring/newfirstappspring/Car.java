package org.example.spring.newfirstappspring;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Car implements Vehicle {

    public Car() {
        System.out.println("Car BEAN constructor is created");
    }

    @PostConstruct
    private void init(){
        System.out.println("Car init is called");
    }

    @PreDestroy
    private void destroy(){
        System.out.println("Car destroy is called");
    }

    @Override
    public void startEngine() {
        System.out.println("car is running");
    }
}