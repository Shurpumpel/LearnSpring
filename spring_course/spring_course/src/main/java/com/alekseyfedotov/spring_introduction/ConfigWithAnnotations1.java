package com.alekseyfedotov.spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3");

        Person person = context.getBean("personBean", Person.class);

//        Pet pet = context.getBean("cat", Pet.class);
//        pet.say();
        person.callYourPet();

        System.out.println(person.getSurname());
        System.out.println(person.getAge());
        context.close();
    }
}
