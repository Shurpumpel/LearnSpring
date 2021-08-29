package com.alekseyfedotov.aop.aspects;

import com.alekseyfedotov.aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

//    @Pointcut("execution(* com.alekseyfedotov.aop.UniLibrary.*(..))")
//    private void allMethodsFromUniLibrary(){}
//
//    @Pointcut("execution(public void com.alekseyfedotov.aop.UniLibrary.returnMagazine())")
//    private void returnMagazineFromUniLibrary(){}
//
//    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
//    private void allMethodsExceptReturnMagazineFromUniLibrary(){}
//
//    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
//    public void beforeallMethodsExceptReturnMagazineFromUniLibraryAdvice(){
//        System.out.println("allMethodsExceptReturnMagazineFromUniLibrary: Log #10");
//    }

//    @Pointcut("execution(* com.alekseyfedotov.aop.UniLibrary.get*())")
//    private void allGetMethodsFromUniLibrary(){}
//
//    @Pointcut("execution(* com.alekseyfedotov.aop.UniLibrary.return*())")
//    private void allReturnMethodsFromUniLibrary(){}
//
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    private void allGetAndReturnMethodsFromUniLibrary(){}
//
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: writing Log #1");
//    }
//
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice: writing Log #2");
//    }
//
//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice(){
//        System.out.println("beforeGetAndReturnLoggingAdvice: writing Log #3");
//
//    }



    @Before("com.alekseyfedotov.aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + signature);
        System.out.println("methodSignature.getMethod = " + signature.getMethod());
        System.out.println("methodSignature.getReturnType = "+ signature.getReturnType());
        System.out.println("methodSignature.getName = " + signature.getName());

        if(signature.getName().equals("addBook")){
            Object[] arguments = joinPoint.getArgs();
            for(Object argument : arguments){
                if (argument instanceof Book){
                    Book myBook = (Book) argument;
                    System.out.println("Информация о книге: название книги - "+
                            myBook.getName()+", автор - "+myBook.getAuthor()+
                            ", год публикации - "+ myBook.getYearOfPublication());
                }else if(argument instanceof String){
                    System.out.println("Книгу в библиотеку добавляет "+ argument);
                }
            }
        }

        System.out.println("beforeGetBookAdvice: попытка получить книгу/журнал");
        System.out.println("--------------------------------------------------------------");

    }




}
