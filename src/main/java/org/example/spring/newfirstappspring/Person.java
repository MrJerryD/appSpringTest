package org.example.spring.newfirstappspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private Vehicle vehicle;

    @Autowired
//    @Qualifier("car) - selected Primary
    public Person(Vehicle vehicle) {
        this.vehicle = vehicle;
        System.out.println("Person BEAN constructor is created");
    }

//    @Autowired
//    public void setVehicle(Vehicle vehicle) {
//        this.vehicle = vehicle;
//        System.out.println("Person/ Vehicle BEAN set value to vehicle field ");
//    }

    public void startVehicleEngine() {
        System.out.println("Person is starting vehicle engine...");
        vehicle.startEngine();
    }
}
