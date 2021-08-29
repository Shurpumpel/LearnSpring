package com.alekseyfedotov.aop.aspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExceptionHandlingAspect {

    @Before("com.alekseyfedotov.aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddExceptionHandlingAdvice(){
        System.out.println("begoreGetExceptionHandlingAdvice: ловим/обрабатываем" +
                "исключения при попытке получить книге/журнал");
        System.out.println("--------------------------------------------------------------");

    }
}
