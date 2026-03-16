package org.example.spring.newfirstappspring.config;

import org.example.spring.newfirstappspring.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PetConfiguration {

    @Bean
    public Dog dog() {
        return new Dog();
    }
}
