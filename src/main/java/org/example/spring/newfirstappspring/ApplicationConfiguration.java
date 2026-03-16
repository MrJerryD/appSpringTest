package org.example.spring.newfirstappspring;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.example.spring.newfirstappspring")
@PropertySource("classpath:application.properties")
public class ApplicationConfiguration {

}
