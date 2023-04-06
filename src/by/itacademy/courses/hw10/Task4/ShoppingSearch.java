package by.itacademy.courses.hw10.Task4;

import java.util.List;
import java.util.Scanner;

public class ShoppingSearch {
    static double search(int money, List<Pet> sortedSet) {
        if (money < 149) {
            for (Pet asd : sortedSet) {
                if (asd.getPrice() < 149) {
                    System.out.println(asd);
                }
            }
        } else if (money >= 150 && money < 299) {
            for (Pet asd : sortedSet) {
                if (asd.getPrice() >= 150 && asd.getPrice() < 299) {
                    System.out.println(asd);
                }
            }
        } else if (money >= 300 && money < 449) {
            for (Pet asd : sortedSet) {
                if (asd.getPrice() >= 300 && asd.getPrice() < 449) {
                    System.out.println(asd);
                }
            }
        } else if (money >= 450) {
            for (Pet asd : sortedSet) {
                if (asd.getPrice() >= 450) {
                    System.out.println(asd);
                }
            }
        }
        System.out.println("Это все питомцы которые у нас есть по вашему запросу");
        System.out.println("А теперь укажите точную сумму для покупки");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();

    }
}
