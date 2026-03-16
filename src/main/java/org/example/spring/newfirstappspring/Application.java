package org.example.spring.newfirstappspring;

//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

//@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        DatabaseConnector databaseConnector = context.getBean("databaseConnector", DatabaseConnector.class);
        databaseConnector.executeSql("SELECT * FROM users");
        context.close();
    }
}
