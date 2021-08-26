package com.alekseyfedotov.spring_introduction;

import org.springframework.context.annotation.*;

@Configuration
//@ComponentScan ("com.alekseyfedotov.spring_introduction")
@PropertySource("myApp.properties")
public class MyConfig {

    @Bean
    public Pet catBean(){
        return new Cat();
    }

    @Bean
    public Person personBean(){
        return new Person(catBean());
    }
}
