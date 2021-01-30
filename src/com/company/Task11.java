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
        outputMenu(menu);
        int answerResponse = sc.nextInt();
        while (answerResponse < 6 || answerResponse < 1) {
            if (sc.nextInt() == 1) {

                outputMenu(menu);
            } else if (sc.nextInt() == 2) {

                outputMenu(menu);
            } else if (sc.nextInt() == 3) {

                outputMenu(menu);
            } else if (sc.nextInt() == 4) {

                outputMenu(menu);
            } else if (sc.nextInt() == 5) {

                outputMenu(menu);
            }





        }


    }
}
