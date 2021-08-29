package com.alekseyfedotov.aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents(){
        Student st1 = new Student("Aleksey Fedotov", 4, 7.5);
        Student st2 = new Student("Viacheslav Shutov", 5, 8.5);
        Student st3 = new Student("Rita Chumakova", 5, 8.9);

        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents(){
        System.out.println("Начало работы метода getStudents");
//        System.out.println(students.get(3));
        System.out.println("Information from method getStudents");
        System.out.println(students);
        return students;
    }
}
