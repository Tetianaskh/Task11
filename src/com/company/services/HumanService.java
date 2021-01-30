package com.company.services;

import com.company.humans.Human;
import com.company.utils.HumanList;

import java.util.Scanner;

/**
 * Написать класс HumanService (сервис по работе с людьми)
 */
public class HumanService {
    private static final Scanner sc = new Scanner(System.in);
    private final HumanList humanList = new HumanList();

    public void addHuman() {
        System.out.println("Введите, пожалуйста, фамилию:");
        String surname = sc.nextLine();
        System.out.println("Введите, пожалуйста, имя:");
        String name = sc.nextLine();
        System.out.println("Введите, пожалуйста, отчество:");
        String patronymic = sc.nextLine();
        Human human = new Human(surname, name, patronymic);
        if (humanList.contains(human)) {
            System.out.println("Такой человек в списке уже есть!");
            System.out.println();
        } else {
            humanList.add(human);
            System.out.println();
        }
    }

    public void printHumanList() {
        System.out.println("Список людей:");
        humanList.print();
        System.out.println();
    }

    public void deleteHuman() {
        System.out.println("Введите, пожалуйста, номер человека которого хотите удалить из списка:");
        int number = Integer.parseInt(sc.nextLine());
        humanList.delete(number - 1);
    }

    public void findHumanBySurname() {
        System.out.println("Введите, пожалуйста, Фамилию человека (людей) которого хотите найти в списке:");
        String surname = sc.nextLine();
        HumanList results = humanList.filterBySurname(surname);
        System.out.println("Результаты поиска по Фамилии:");
        results.print();
        System.out.println();
    }

    public void findHumanByName() {
        System.out.println("Введите, пожалуйста, Имя человека (людей) которого хотите найти в списке:");
        String name = sc.nextLine();
        HumanList results = humanList.filterByName(name);
        System.out.println("Результаты поиска по Имени:");
        results.print();
        System.out.println();
    }
}
