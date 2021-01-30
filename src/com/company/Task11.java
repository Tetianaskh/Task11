package com.company;


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
                "Найти человека (людей) по фамилии", "Найти человека по имени", "Завершить работу"};
        Scanner sc = new Scanner(System.in);
        HumanService hs = new HumanService();
        while (true) {
            outputMenu(menu);
            int answer = sc.nextInt();
            if (answer == 1) {

            } else if (answer == 2) {

            } else if (answer == 3) {

            } else if (answer == 4) {

            } else if (answer == 5) {

            } else if (answer == 6) {
                break;
            }
        }
        System.out.println("Работа завершена! Всего доброго!");
    }
}
