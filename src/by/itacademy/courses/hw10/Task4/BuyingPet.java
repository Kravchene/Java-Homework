package by.itacademy.courses.hw10.Task4;

import java.util.List;

public class BuyingPet {
    static void buy(double a, List<Pet> v) {
        int index = 0;
        boolean b = false;
        for (Pet pet : v) {
            if (pet.getPrice() == a) {
                index = v.indexOf(pet);
                b = true;
            }
        }
        if (b == true) {
            v.remove(index);
            System.out.println("Спасибо за покупку");
        } else {
            System.out.println("Вы ввели чтото не так питомца с такой ценой нет");
        }

    }
}