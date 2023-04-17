package by.itacademy.courses.hw10.Task4;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Pet> sortedSet = new LinkedList<>();
        System.out.println("Добро пожаловать в магазин");
        sortedSet.add(new Pet("Gosha", "Cockatoo", 3, 1.5, 154));
        sortedSet.add(new Pet("Kesha", "Cockatoo", 5, 2, 41));
        sortedSet.add(new Pet("blackie", "Maine Coon", 15, 12, 516));
        sortedSet.add(new Pet("snowball", "Maine Coon", 10, 11.2, 205));
        sortedSet.add(new Pet("Frederick", "Border Collie", 10, 17, 300));
        sortedSet.add(new Pet("Lancelot", "Border Collie", 10, 20.1, 600));
        System.out.println(sortedSet);
        Collections.sort(sortedSet);//сортировка по кличке
        System.out.println(sortedSet);
        Collections.sort(sortedSet, Pet.PetStoreComparator);//сортировка по цене
        System.out.println(sortedSet);
        Scanner in1 = new Scanner(System.in);
        System.out.println("*** Это раздел поиска ***");
        System.out.println("Укажите сумму которую вы готовы заплатить за питомца и мы вам подберем самые близкие к этому значнию");
        int money = in1.nextInt();
        BuyingPet.buy(ShoppingSearch.search(money, sortedSet), sortedSet);
        System.out.println(sortedSet);

    }
}
