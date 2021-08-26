package com.alekseyfedotov.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        Pet pet = new Dog();

        pet.say();
    }
}
