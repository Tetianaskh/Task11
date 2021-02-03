package com.company.services;

import com.company.exception.HumanAlreadyExistsException;
import com.company.humans.Human;
import com.company.utils.HumanList;

/**
 * Написать класс HumanService (сервис по работе с людьми)
 */
public class HumanService {
    private final HumanList humanList = new HumanList();

    public void addHuman(String surname, String name, String patronymic) {
        Human human = new Human(surname, name, patronymic);
        if (humanList.contains(human)) {
            throw new HumanAlreadyExistsException("Такой человек в списке уже есть!");
        } else {
            humanList.add(human);
        }
    }

    public String[] printHumanList() {
       return humanList.getAsStringArray();
    }

    public void deleteHuman(int number) {
        humanList.delete(number - 1);
    }

    public HumanList findHumanBySurname(String surname) {
        return humanList.filterBySurname(surname);
    }

    public HumanList findHumanByName(String name) {
        return humanList.filterByName(name);
    }
}
