package com.sp.unitt.files.domain;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Person {
    private String name;


    public static void main(String[] args) {
        SpringApplication.run(Person.class, args);
        System.out.println("234234");
    }

}
