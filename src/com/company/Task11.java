package com.company;

import com.company.*;

public class Task11 {

    /**
     * Написать класс Human (фамилия, имя, отчество),
     * переопределять в нем методы equals, hashCode, toString
     * Написать класс HumanList (список людей) и класс HumanService (сервис по работе с людьми)
     *
     * Реализовать меню позволяющее:
     * добавить человека (если такой уже есть - вывести ошибку)
     * вывести список
     * удалить человека по номеру
     * найти человека (людей) по фамилии
     * найти человека по имени
     */
    public static void main(String[] args) {
        Human[] humans = HumanList;

        for (Human human : humans) {
            System.out.println(human.toString());
        }

    }
}
