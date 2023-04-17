package by.itacademy.courses.hw8.Task3;

import by.itacademy.courses.hw8.Task3.Enum.ClothingProtectionClass;
import by.itacademy.courses.hw8.Task3.Enum.ClothingSize;
import by.itacademy.courses.hw8.Task3.Enum.ModelAndColor;
import by.itacademy.courses.hw8.Task3.Enum.ShoeSize;
import by.itacademy.courses.hw8.Task3.clothingAndShoes.Clothes;
import by.itacademy.courses.hw8.Task3.clothingAndShoes.Shoes;
import by.itacademy.courses.hw8.Task3.clothingAndShoes.WorkWear;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClothingStore {
    List<Clothes> listClothes = new ArrayList<>();
    List<Shoes> listShoes = new ArrayList<>();
    CaseLogic caseLogic = new CaseLogic();
    Scanner scanner = new Scanner(System.in);
    PrintText printText = new PrintText();

    void hello() {
        System.out.println("Добро пожаловать в магазин");
        System.out.println("Если вы ищете одежду нажмите 1\nЕсли вы ищете обувь нажмите 2 ");
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
                printText.printTextCase1();
                caseLogic.case1Clothes(scanner.nextInt(), listClothes);
                break;
            case 2:
                printText.printTextCase2();
                caseLogic.case2Shoes(scanner.nextInt(), listShoes);
            default:
                printText.defaultCase();
                break;
        }
    }
}


