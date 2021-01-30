package com.company;

import java.util.Arrays;

/**
 * Написать класс Human (фамилия, имя, отчество),
 * переопределять в нем методы equals, hashCode, toString
 */
public class Human {
    private String surname;
    private String name;
    private String patronymic;

    public Human(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

//    public String equals() {
//
//    }
//
//    public  hashCode() {
//
//    }
//
//    public String toString() {
//        return surname + " " + name + " " + patronymic;
//    }
    
}
