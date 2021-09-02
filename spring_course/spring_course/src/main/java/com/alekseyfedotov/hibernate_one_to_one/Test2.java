package com.alekseyfedotov.hibernate_one_to_one;

import com.alekseyfedotov.hibernate_one_to_one.entity.Detail;
import com.alekseyfedotov.hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = null;
        try {
            session = factory.getCurrentSession();

//            Employee emp = new Employee("Aleksey", "Fedotov"
//                    , "IT", 950);
//            Detail detail = new Detail("London", "123455", "abcd1@bcda.ru");
//
//            emp.setEmpDetail(detail);
//            detail.setEmployee(emp);

            session.beginTransaction();

            Detail detail = session.get(Detail.class, 1);
            detail.getEmployee().setEmpDetail(null);
            session.delete(detail);

            session.getTransaction().commit();
        } finally {
            session.close();
            factory.close();
        }
    }
}
