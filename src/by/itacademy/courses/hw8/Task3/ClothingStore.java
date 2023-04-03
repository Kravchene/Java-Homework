package by.itacademy.courses.hw8.Task3;

import by.itacademy.courses.hw8.Task3.Clothing_and__shoes.Clothes;
import by.itacademy.courses.hw8.Task3.Clothing_and__shoes.Shoes;
import by.itacademy.courses.hw8.Task3.Clothing_and__shoes.WorkWear;
import by.itacademy.courses.hw8.Task3.Enum.ClothingProtectionClass;
import by.itacademy.courses.hw8.Task3.Enum.ClothingSize;
import by.itacademy.courses.hw8.Task3.Enum.ModelAndColor;
import by.itacademy.courses.hw8.Task3.Enum.ShoeSize;

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
        Clothes clothes1 = new Clothes(ModelAndColor.MODEL1.getModelAndColor(), ClothingSize.SIZE_20.getClothingSize(), ModelAndColor.COLOR1.getModelAndColor());
        Clothes clothes2 = new Clothes(ModelAndColor.MODEL1.getModelAndColor(), ClothingSize.SIZE_32.getClothingSize(), ModelAndColor.COLOR2.getModelAndColor());
        Clothes clothes3 = new Clothes(ModelAndColor.MODEL2.getModelAndColor(), ClothingSize.SIZE_32.getClothingSize(), ModelAndColor.COLOR1.getModelAndColor());
        Clothes clothes4 = new Clothes(ModelAndColor.MODEL2.getModelAndColor(), ClothingSize.SIZE_52.getClothingSize(), ModelAndColor.COLOR2.getModelAndColor());
        Shoes shoes1 = new Shoes(ModelAndColor.MODEL3.getModelAndColor(), ShoeSize.SHOE_SIZE35.getShoeSize(), ModelAndColor.COLOR1.getModelAndColor());
        Shoes shoes2 = new Shoes(ModelAndColor.MODEL3.getModelAndColor(), ShoeSize.SHOE_SIZE40.getShoeSize(), ModelAndColor.COLOR1.getModelAndColor());
        Shoes shoes4 = new Shoes(ModelAndColor.MODEL4.getModelAndColor(), ShoeSize.SHOE_SIZE40.getShoeSize(), ModelAndColor.COLOR2.getModelAndColor());
        Shoes shoes3 = new Shoes(ModelAndColor.MODEL4.getModelAndColor(), ShoeSize.SHOE_SIZE41.getShoeSize(), ModelAndColor.COLOR1.getModelAndColor());
        WorkWear workWear1 = new WorkWear(ModelAndColor.MODEL5.getModelAndColor(), ClothingSize.SIZE_55.getClothingSize(), ModelAndColor.COLOR4.getModelAndColor(), ClothingProtectionClass.COLD_PROTECTION_LEVEL2.getLevel(), ClothingProtectionClass.WATER_PROTECTION_LEVEL2.getLevel());
        WorkWear workWear2 = new WorkWear(ModelAndColor.MODEL5.getModelAndColor(), ClothingSize.SIZE_60.getClothingSize(), ModelAndColor.COLOR3.getModelAndColor(), ClothingProtectionClass.COLD_PROTECTION_LEVEL1.getLevel(), ClothingProtectionClass.WATER_PROTECTION_LEVEL1.getLevel());
        WorkWear workWear3 = new WorkWear(ModelAndColor.MODEL5.getModelAndColor(), ClothingSize.SIZE_70.getClothingSize(), ModelAndColor.COLOR1.getModelAndColor(), ClothingProtectionClass.COLD_PROTECTION_LEVEL3.getLevel(), ClothingProtectionClass.WATER_PROTECTION_LEVEL3.getLevel());
        listClothes.add(clothes1);
        listClothes.add(clothes2);
        listClothes.add(clothes3);
        listClothes.add(clothes4);
        listClothes.add(workWear1);
        listClothes.add(workWear2);
        listClothes.add(workWear3);
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
                        String words = usersDecision2();
                        int number1 = usersDecision();
                        String words1 = usersDecision2();
                        WorkWear workWear1 = new WorkWear(words, number1, words1);
                        Clothes search1 = new Clothes(words, number1, words1);
                        for (Clothes listClothes1 : listClothes) {
                            if (listClothes1.equals(search1) && listClothes1.getColour().contains(search1.getColour()) && listClothes1.getModel().contains(search1.getModel()) ||
                                    listClothes1.equals(workWear1) && listClothes1.getColour().contains(workWear1.getColour()) && listClothes1.getModel().contains(workWear1.getModel())) {
                                System.out.println(listClothes1);
                                System.out.println("Товар найден Можете его купить");
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Укажите размер и цвет");
                        int number2 = usersDecision();
                        String words2 = usersDecision2();
                        WorkWear workWear2 = new WorkWear(number2, words2);
                        Clothes search2 = new Clothes(number2, words2);
                        for (Clothes listClothes2 : listClothes) {
                            if (listClothes2.equals(search2) && listClothes2.getColour().contains(search2.getColour()) ||
                                    listClothes2.equals(workWear2) && listClothes2.getColour().contains(workWear2.getColour())) {
                                System.out.println(listClothes2);
                                System.out.println("Товар найден Можете его купить");
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Укажите размер");
                        int number3 = usersDecision();
                        WorkWear workWear3 = new WorkWear(number3);
                        Clothes search3 = new Clothes(number3);
                        for (Clothes listClothes3 : listClothes) {
                            if (listClothes3.equals(search3) || listClothes3.equals(workWear3)) {
                                System.out.println(listClothes3);
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
                        Shoes search1 = new Shoes(usersDecision2(), usersDecision(), usersDecision2());
                        for (Clothes listClothes1 : listClothes) {
                            if (listClothes1.equals(search1) && listClothes1.getColour().contains(search1.getColour()) && listClothes1.getModel().contains(search1.getModel())) {
                                System.out.println(listClothes1.toString());
                                System.out.println("Товар найден Можете его купить");
                            }
                        }
                        break;
                    case 2:
                        System.out.println("Укажите размер и цвет");
                        Shoes search2 = new Shoes(usersDecision(), usersDecision2());
                        for (Clothes listClothes2 : listClothes) {
                            if (listClothes2.equals(search2) && listClothes2.getColour().contains(search2.getColour())) {
                                System.out.println(listClothes2.toString());
                                System.out.println("Товар найден Можете его купить");
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Укажите размер");
                        Shoes search3 = new Shoes(usersDecision());
                        for (Clothes listClothes3 : listClothes) {
                            if (listClothes3.equals(search3)) {
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

