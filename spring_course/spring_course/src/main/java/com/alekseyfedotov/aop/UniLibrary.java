package com.alekseyfedotov.aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {

//    @Override
//    public void getBook(Book book) {
//        System.out.println("Мы берем книгу \"" + book.getName()
//                + "\" из UniLibrary");
//    }

    public void addBook(String person_name, Book book) {
        System.out.println("Мы добавлем книгу в UniLibrary");
    }

    public void getBook() {
        System.out.println("Мы берем книгу из UniLibrary");
        System.out.println("--------------------------------------------------------------");
    }

    public String returnBook(){
        System.out.println("Мы вернули книгу в UniLibrary");
        return "Война и мир";
    }

    public void addMagazine() {
        System.out.println("Мы добавлем журнал в UniLibrary");
        System.out.println("--------------------------------------------------------------");

    }

    public void getMagazine() {
        System.out.println("Мы берем журнал из UniLibrary");
        System.out.println("--------------------------------------------------------------");

    }

    public void returnMagazine() {
        System.out.println("Мы вернули журнал в UniLibrary");
        System.out.println("--------------------------------------------------------------");

    }


}
