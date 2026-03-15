package org.example.spring.newfirstappspring;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.example.spring.newfirstappspring");
        Vehicle vehicle1 = context.getBean("car", Vehicle.class);
        vehicle1.startEngine();

        context.close();
        System.out.println("Program is finished");
    }
}
