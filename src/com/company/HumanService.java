package com.company;

import java.util.Arrays;

/**
 * Написать класс HumanService (сервис по работе с людьми)
 */
public class HumanService {
    private Human[] humans = new Human[0];

    public void add(Human human) {
        humans = Arrays.copyOf(humans, humans.length + 1);
        humans[humans.length - 1] = human;
    }

    public void delete(Human human) {
        humans = removeArrayElement(humans, deleteTaskNumber - 1);
    }
}
