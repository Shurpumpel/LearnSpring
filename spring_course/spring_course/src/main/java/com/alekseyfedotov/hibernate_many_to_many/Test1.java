package com.alekseyfedotov.hibernate_many_to_many;

import com.alekseyfedotov.hibernate_many_to_many.entity.Child;
import com.alekseyfedotov.hibernate_many_to_many.entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;

        try{
//            session = factory.getCurrentSession();
//
//            Section section1 = new Section("football");
//            Child child1 = new Child("Aleksey", 15);
//            Child child2 = new Child("Viktor", 12);
//            Child child3 = new Child("Masha", 16);
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);
//
//            session.beginTransaction();
//
//            session.save(section1);
//
//            session.getTransaction().commit();
//*******************************************************************************
//            session = factory.getCurrentSession();
//
//            Section section1 = new Section("volleyball");
//            Section section2 = new Section("chess");
//            Section section3 = new Section("math");
//
//            Child child1 = new Child("Igor", 10);
//
//            child1.addSectionToChild(section1);
//            child1.addSectionToChild(section2);
//            child1.addSectionToChild(section3);
//
//
//
//            session.beginTransaction();
//
//            session.save(child1);
//
//            session.getTransaction().commit();

//*******************************************************************************
            session = factory.getCurrentSession();
            session.beginTransaction();

            Section section = session.get(Section.class, 1);

            System.out.println(section);
            System.out.println(section.getChildren());

            session.getTransaction().commit();
            System.out.println("Done!");
        }finally {
            session.close();
            factory.close();
        }
    }
}
