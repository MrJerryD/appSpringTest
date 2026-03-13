package org.example.spring.newfirstappspring;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class Application {

    public static void main(String[] args) {
//        SpringApplication.run(NewFirstAppSpringApplication.class, args);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.example.spring.newfirstappspring");
        Vehicle vehicle = context.getBean("motorbike", Vehicle.class);
        vehicle.startEngine();
        context.close();
    }
}
