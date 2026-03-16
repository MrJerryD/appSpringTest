package org.example.spring.newfirstappspring;

public class Person {

    private Vehicle vehicle;
    private Dog dog;

    public Person(Vehicle vehicle, Dog dog) {
        this.vehicle = vehicle;
        this.dog = dog;
        System.out.println("Persosn created");
    }

    public void startVehicleEngine(){
        System.out.println("Person started vehicle engine...");
        vehicle.startEngine();
    }

    public void callPet(){
        System.out.println("Person call pet...");
        System.out.println(dog.getName() + " come to me");
    }
}
