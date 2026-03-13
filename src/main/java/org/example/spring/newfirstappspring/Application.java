package org.example.spring.newfirstappspring;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@SpringBootApplication
public class Application {

    public static void main(String[] args) {
//        SpringApplication.run(NewFirstAppSpringApplication.class, args);

        //IoC
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.example.spring.newfirstappspring");
        //DI
        Person person = context.getBean("person", Person.class);
        person.startVehicleEngine();

        Parking parking = context.getBean("parking", Parking.class);
        System.out.println(parking.getVehiclesList());
        System.out.println(parking.getVehiclesMap());
        context.close();
    }
}
