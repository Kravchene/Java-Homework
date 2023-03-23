package by.itacademy.courses.hw8.Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClothingStore {
    List<Clothes> listClothes = new ArrayList<>();
    List<Shoes> listShoes = new ArrayList<>();

    void hello() {
        System.out.println("Добро пожаловать в магазин");
        System.out.println("Если вы ищете одежду нажмите 1\nЕсли вы ищете обувь нажмите 2 ");
    }
    String usersDecision2() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }


    int usersDecision() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    void creatingAndFillingCollection() {
        Clothes clothes1 = new Clothes(Number.modelClothes1, Number.clothes1, Number.colour1);
        Clothes clothes2 = new Clothes(Number.modelClothes1, Number.clothes2, Number.colour2);
        Clothes clothes3 = new Clothes(Number.modelClothes2, Number.clothes3, Number.colour1);
        Clothes clothes4 = new Clothes(Number.modelClothes2, Number.clothes3, Number.colour2);
        Shoes shoes1 = new Shoes(Number.modelShoes1, Number.shoes1, Number.colour1);
        Shoes shoes2 = new Shoes(Number.modelShoes1, Number.shoes2, Number.colour1);
        Shoes shoes4 = new Shoes(Number.modelShoes2, Number.shoes2, Number.colour2);
        Shoes shoes3 = new Shoes(Number.modelShoes2, Number.shoes3, Number.colour1);
        listClothes.add(clothes1);
        listClothes.add(clothes2);
        listClothes.add(clothes3);
        listClothes.add(clothes4);
        listShoes.add(shoes1);
        listShoes.add(shoes2);
        listShoes.add(shoes3);
        listShoes.add(shoes4);
    }

    void shop(int a) {
        switch (a) {
            case 1:
                System.out.println("Вы попали в раздел одежда");
                System.out.println("Если вы ищете конкретную одежду нажмите 1");
                System.out.println("Если вам не важна модель и важен только размер и цвет то нажмите 2 мы вам подберут все возможные эксемпляры");
                System.out.println("Если вам важен только размер нажмите 3 мы вам подберут все возможные эксемпляры");
                switch (usersDecision()) {
                    case 1:
                        System.out.println("Укажите модель,размер и цвет");
                        Clothes search1 = new Clothes(usersDecision2(),usersDecision(),usersDecision2());
                        for (Clothes listClothes1 : listClothes) {
                            if (listClothes1.equals(search1)) {
                                System.out.println(listClothes1.toString());
                                System.out.println("Товар найден Можете его купить");
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Укажите размер и цвет");
                        Clothes search2 = new Clothes(usersDecision(),usersDecision2());
                        for (Clothes listClothes2 : listClothes) {
                            if (listClothes2.equals2(search2)) {
                                System.out.println(listClothes2.toString());
                                System.out.println("Товар найден Можете его купить");
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Укажите размер");
                        Clothes search3 = new Clothes(usersDecision());
                        for (Clothes listClothes3 : listClothes) {
                            if (listClothes3.equals1(search3)) {
                                System.out.println(listClothes3.toString());
                                System.out.println("Товар найден Можете его купить");
                            }
                        }
                        break;
                    default:
                        System.out.println("Ошибка попробуй снова");
                        break;
                }
                break;
            case 2:
                System.out.println("Вы попали в раздел обувь");
                System.out.println("Если вы ищете конкретную обувь нажмите 1");
                System.out.println("Если вам не важна модель и важен только размер и цвет то нажмите 2 мы вам подберут все возможные эксемпляры");
                System.out.println("Если вам важен только размер нажмите 3 мы вам подберут все возможные эксемпляры");
                switch (usersDecision()) {
                    case 1:
                        System.out.println("Укажите модель,размер и цвет");
                        Shoes search1 = new Shoes(usersDecision2(), usersDecision(),usersDecision2());
                        for (Clothes listClothes1 : listClothes) {
                            if (listClothes1.equals(search1)) {
                                System.out.println(listClothes1.toString());
                                System.out.println("Товар найден Можете его купить");
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Укажите размер и цвет");
                        Shoes search2 = new Shoes(usersDecision(), usersDecision2());
                        for (Clothes listClothes2 : listClothes) {
                            if (listClothes2.equals2(search2)) {
                                System.out.println(listClothes2.toString());
                                System.out.println("Товар найден Можете его купить");
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Укажите размер");
                        Shoes search3 = new Shoes(usersDecision());
                        for (Clothes listClothes3 : listClothes) {
                            if (listClothes3.equals1(search3)) {
                                System.out.println(listClothes3.toString());
                                System.out.println("Товар найден Можете его купить");
                            }
                        }
                        break;
                    default:
                        System.out.println("Ошибка попробуй снова");
                        break;
                }
            default:
                System.out.println("Ошибка попробуй снова");
                break;
        }
    }

}
