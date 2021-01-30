package com.company.humans;

import java.util.Objects;

/**
 * Написать класс Human (фамилия, имя, отчество),
 * переопределять в нем методы equals, hashCode, toString
 */
public class Human {
    private final String surname;
    private final String name;
    private final String patronymic;

    public Human(String surname, String name, String patronymic) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return surname.equalsIgnoreCase(human.surname) &&
                name.equalsIgnoreCase(human.name) &&
                patronymic.equalsIgnoreCase(human.patronymic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname.toLowerCase(), name.toLowerCase(), patronymic.toLowerCase());
    }

    @Override
    public String toString() {
        return surname + " " + name + " " + patronymic;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }
}
