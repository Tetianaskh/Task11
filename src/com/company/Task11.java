package com.company;

import com.company.services.HumanService;
import com.company.ui.ConsoleApp;

import java.util.Scanner;

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
        HumanService hs = new HumanService();
        ConsoleApp app = new ConsoleApp(hs);
        app.run();
    }
}
