package com.company.ui;

import com.company.Result;
import com.company.ResultType;
import com.company.services.HumanService;
import com.company.utils.HumanList;

import java.util.Scanner;

public class ConsoleApp {

    private static final Scanner sc = new Scanner(System.in);
    public static final String[] MENU = {
        "Добавить человека",
        "Вывести список",
        "Удалить человека по номеру",
        "Найти человека (людей) по фамилии",
        "Найти человека (людей) по имени",
        "Завершить работу"};

    private final HumanService humanService;

    public ConsoleApp(HumanService humanService) {
        this.humanService = humanService;
    }

    public void run() {
        while (true) {
            outputMenu();
            String answer = sc.nextLine();
            if (answer.equals("1")) {
                addHuman();
            } else if (answer.equals("2")) {
                printHumanList();
            } else if (answer.equals("3")) {
                deleteHuman();
            } else if (answer.equals("4")) {
                findHumanBySurname();
            } else if (answer.equals("5")) {
                findHumanByName();
            } else if (answer.equals("6")) {
                break;
            }
        }
        System.out.println("Работа завершена! Всего доброго!");
    }

    public void addHuman() {
        System.out.println("Введите, пожалуйста, фамилию:");
        String surname = sc.nextLine();
        System.out.println("Введите, пожалуйста, имя:");
        String name = sc.nextLine();
        System.out.println("Введите, пожалуйста, отчество:");
        String patronymic = sc.nextLine();

        Result res = humanService.addHuman(surname, name, patronymic);
        if (res.getResultType() == ResultType.Error) {
            System.out.println(res.getErrorMessage());
            System.out.println();
        }
    }

    public void deleteHuman() {
        System.out.println("Введите, пожалуйста, номер человека которого хотите удалить из списка:");
        int number = Integer.parseInt(sc.nextLine());
        humanService.deleteHuman(number);
    }

    public void findHumanBySurname() {
        System.out.println("Введите, пожалуйста, Фамилию человека (людей) которого хотите найти в списке:");
        String surname = sc.nextLine();
        HumanList results = humanService.findHumanBySurname(surname);
        System.out.println("Результаты поиска по Фамилии:");
        for (String h : results.getAsStringArray()) {
            System.out.println(h);
        }
        System.out.println();
    }

    public void findHumanByName() {
        System.out.println("Введите, пожалуйста, Имя человека (людей) которого хотите найти в списке:");
        String name = sc.nextLine();
        HumanList results = humanService.findHumanByName(name);
        System.out.println("Результаты поиска по Имени:");
        for (String h : results.getAsStringArray()) {
            System.out.println(h);
        }
        System.out.println();
    }

    public void printHumanList() {
        System.out.println("Список людей:");
        for (String s : humanService.printHumanList()) {
            System.out.println(s);
        }
        System.out.println();
    }

    private static void outputMenu() {
        System.out.println("Добрый день!");
        System.out.println("Какое действие Вы хотите совершить?");
        for (int i = 0; i < MENU.length; i++) {
            System.out.println(i + 1 + ". " + MENU[i]);
        }
    }


}
