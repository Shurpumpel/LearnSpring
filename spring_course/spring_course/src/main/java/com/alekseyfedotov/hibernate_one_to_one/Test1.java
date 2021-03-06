package com.alekseyfedotov.hibernate_one_to_one;

import com.alekseyfedotov.hibernate_one_to_one.entity.Detail;
import com.alekseyfedotov.hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = null;
        try {
//            Session session = factory.getCurrentSession();
//            Employee emp = new Employee("Mikhail", "Ivanov"
//                    , "HR", 750);
//            Detail detail = new Detail("Moscow", "123456", "abcd@bcda.ru");
//            emp.setEmpDetail(detail);
//
//            session.beginTransaction();
//            session.save(emp);
//            session.getTransaction().commit();


            session = factory.getCurrentSession();
            session.beginTransaction();

            Employee employee = session.get(Employee.class, 1);

            session.getTransaction().commit();
            System.out.println(employee);
        }finally {
            session.close();
            factory.close();
        }
    }
}
