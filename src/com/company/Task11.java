package com.company;

import com.company.services.HumanService;

import java.util.Scanner;

public class Task11 {

    private static void outputMenu(String[] menu) {
        System.out.println("Добрый день!");
        System.out.println("Какое действие Вы хотите совершить?");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + 1 + ". " + menu[i]);
        }
    }

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
        String[] menu = {"Добавить человека", "Вывести список", "Удалить человека по номеру",
                "Найти человека (людей) по фамилии", "Найти человека (людей) по имени", "Завершить работу"};
        Scanner sc = new Scanner(System.in);
        HumanService hs = new HumanService();
        while (true) {
            outputMenu(menu);
            String answer = sc.nextLine();
            if (answer.equals("1")) {
                hs.addHuman();
            } else if (answer.equals("2")) {
                hs.printHumanList();
            } else if (answer.equals("3")) {
                hs.deleteHuman();
            } else if (answer.equals("4")) {
                hs.findHumanBySurname();
            } else if (answer.equals("5")) {
                hs.findHumanByName();
            } else if (answer.equals("6")) {
                break;
            }
        }
        System.out.println("Работа завершена! Всего доброго!");
    }
}
