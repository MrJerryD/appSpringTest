package org.example.spring.newfirstappspring;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.example.spring.newfirstappspring.config.PetConfiguration;
import org.example.spring.newfirstappspring.config.VehicleConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        Person person = context.getBean(Person.class);
        person.startVehicleEngine();
        person.callPet();
        context.close();
    }
}
