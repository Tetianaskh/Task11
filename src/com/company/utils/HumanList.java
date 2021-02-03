package com.company.utils;

import com.company.humans.Human;

import java.util.Arrays;

/**
 * Написать класс HumanList (список людей)
 */
public class HumanList {
private Human[] humans = new Human[0];

    private static Human[] removeArrayElement(Human[] array, int index) {
        Human[] array2 = new Human[array.length - 1];
        for (int i = 0; i < array2.length; i++) {
            if (i < index) {
                array2[i] = array[i];
            } else {
                array2[i] = array[i + 1];
            }
        }
        return array2;
    }

    public void add(Human human) {
        humans = Arrays.copyOf(humans, humans.length + 1);
        humans[humans.length - 1] = human;
    }

    public String[] getAsStringArray() {
        String[] res = new String[humans.length];
        for (int i = 0; i < humans.length; i++) {
            res[i] = (i + 1) + ". " + humans[i];
        }
        return res;
    }

    public void delete(int index) {
        humans = removeArrayElement(humans, index);
    }

    public HumanList filterBySurname(String surname) {
        HumanList filtered = new HumanList();
        for (Human human : humans) {
            if (surname.equalsIgnoreCase(human.getSurname())) {
                filtered.add(human);
            }
        }
        return filtered;
    }

    public HumanList filterByName(String name) {
        HumanList filtered = new HumanList();
        for (Human human : humans) {
            if (name.equalsIgnoreCase(human.getName())) {
                filtered.add(human);
            }
        }
        return filtered;
    }

    public boolean contains(Human human) {
        for (Human h : humans) {
            if (h.equals(human)) {
                return true;
            }
        }
        return false;
    }
}
