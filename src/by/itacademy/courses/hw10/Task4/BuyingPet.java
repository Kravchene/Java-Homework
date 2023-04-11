package by.itacademy.courses.hw10.Task4;

import java.util.List;

public class BuyingPet {
    static void buy(double money, List<Pet> v) {
        int index = 0;
        boolean didYouSellTheProduct = false;
        for (Pet pet : v) {
            if (pet.getPrice() == money) {
                index = v.indexOf(pet);
                didYouSellTheProduct = true;
            }
        }
        if (didYouSellTheProduct) {
            v.remove(index);
            System.out.println("Спасибо за покупку");
        } else {
            System.out.println("Вы ввели чтото не так питомца с такой ценой нет");
        }

    }
}