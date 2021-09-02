package com.alekseyfedotov.hibernate_one_to_many_uni;

import com.alekseyfedotov.hibernate_one_to_many_uni.entity.Department;
import com.alekseyfedotov.hibernate_one_to_many_uni.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();
        Session session = null;
        try {
//            session = factory.getCurrentSession();
//            Department dep = new Department("HR", 500, 1500);
//            Employee emp1 = new Employee("Oleg", "Ivanov", 600);
//            Employee emp2 = new Employee("Andrew", "Sidorov", 800);
//            dep.addEmployeeToDepartment(emp1);
//            dep.addEmployeeToDepartment(emp2);
//
//            session.beginTransaction();
//
//            session.save(dep);
//
//            session.getTransaction().commit();

//****************************************************************************8

            session = factory.getCurrentSession();
            session.beginTransaction();

//            Department department = session.get(Department.class, 1);
//            session.delete(department);
            Employee employee = session.get(Employee.class, 3);
            session.delete(employee);
            session.getTransaction().commit();


            System.out.println("Done!");


        }finally {
            session.close();
            factory.close();
        }
    }
}
