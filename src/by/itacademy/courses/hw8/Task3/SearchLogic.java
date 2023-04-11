package by.itacademy.courses.hw8.Task3;

import by.itacademy.courses.hw8.Task3.clothingAndShoes.Clothes;
import by.itacademy.courses.hw8.Task3.clothingAndShoes.Shoes;
import by.itacademy.courses.hw8.Task3.clothingAndShoes.WorkWear;

import java.util.List;
import java.util.Scanner;

public class SearchLogic {
    String usersDecision2() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }


    int usersDecision() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }


    public void searchClothesCase1(List<Clothes> t) {
        System.out.println("Укажите модель,размер и цвет");
        String words = usersDecision2();
        int number1 = usersDecision();
        String words1 = usersDecision2();
        WorkWear workWear1 = new WorkWear(words, number1, words1);
        Clothes search1 = new Clothes(words, number1, words1);
        for (Clothes listClothes1 : t) {
            if (listClothes1.equals(search1) && listClothes1.getColour().contains(search1.getColour()) && listClothes1.getModel().contains(search1.getModel()) ||
                    listClothes1.equals(workWear1) && listClothes1.getColour().contains(workWear1.getColour()) && listClothes1.getModel().contains(workWear1.getModel())) {
                System.out.println(listClothes1);
                System.out.println("Товар найден Можете его купить");
            }
        }
    }

    public void searchClothesCase2(List<Clothes> t) {
        System.out.println("Укажите размер и цвет");
        int number2 = usersDecision();
        String words2 = usersDecision2();
        WorkWear workWear2 = new WorkWear(number2, words2);
        Clothes search2 = new Clothes(number2, words2);
        for (Clothes listClothes2 : t) {
            if (listClothes2.equals(search2) && listClothes2.getColour().contains(search2.getColour()) ||
                    listClothes2.equals(workWear2) && listClothes2.getColour().contains(workWear2.getColour())) {
                System.out.println(listClothes2);
                System.out.println("Товар найден Можете его купить");
            }
        }
    }

    public void searchClothesCase3(List<Clothes> t) {
        System.out.println("Укажите размер");
        int number3 = usersDecision();
        WorkWear workWear3 = new WorkWear(number3);
        Clothes search3 = new Clothes(number3);
        for (Clothes listClothes3 : t) {
            if (listClothes3.equals(search3) || listClothes3.equals(workWear3)) {
                System.out.println(listClothes3);
                System.out.println("Товар найден Можете его купить");
            }
        }
    }

    public void searchShoesCase1(List<Shoes> t) {
        System.out.println("Укажите модель,размер и цвет");
        Shoes search1 = new Shoes(usersDecision2(), usersDecision(), usersDecision2());
        for (Clothes listClothes1 : t) {
            if (listClothes1.equals(search1) && listClothes1.getColour().contains(search1.getColour()) && listClothes1.getModel().contains(search1.getModel())) {
                System.out.println(listClothes1.toString());
                System.out.println("Товар найден Можете его купить");
            }
        }
    }

    public void searchShoesCase2(List<Shoes> t) {
        System.out.println("Укажите размер и цвет");
        Shoes search2 = new Shoes(usersDecision(), usersDecision2());
        for (Clothes listClothes2 : t) {
            if (listClothes2.equals(search2) && listClothes2.getColour().contains(search2.getColour())) {
                System.out.println(listClothes2.toString());
                System.out.println("Товар найден Можете его купить");
            }
        }

    }

    public void searchShoesCase3(List<Shoes> t) {
        System.out.println("Укажите размер");
        Shoes search3 = new Shoes(usersDecision());
        for (Clothes listClothes3 : t) {
            if (listClothes3.equals(search3)) {
                System.out.println(listClothes3.toString());
                System.out.println("Товар найден Можете его купить");
            }
        }
    }
}
