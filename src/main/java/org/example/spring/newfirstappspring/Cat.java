package org.example.spring.newfirstappspring;

import org.springframework.stereotype.Component;

@Component
public class Cat {

    public  Cat() {
        System.out.println("Cat constructor");
    }

    public String getName() {
        return "Kitty";
    }
}
