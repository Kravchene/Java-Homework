package by.itacademy.courses.hw8.Task3;

import by.itacademy.courses.hw8.Task3.clothingAndShoes.Clothes;
import by.itacademy.courses.hw8.Task3.clothingAndShoes.Shoes;

import java.util.List;

public class CaseLogic {
    PrintText printText = new PrintText();
    SearchLogic searchLogic = new SearchLogic();

    public void case1Clothes(int a, List<Clothes> t) {
        switch (a) {

            case 1:
                searchLogic.searchClothesCase1(t);
                break;
            case 2:
                searchLogic.searchClothesCase2(t);
                break;
            case 3:
                searchLogic.searchClothesCase3(t);
                break;
            default:
                printText.defaultCase();
                break;
        }
    }

    public void case2Shoes(int a, List<Shoes> t) {
        switch (a) {
            case 1:
                searchLogic.searchShoesCase1(t);
                break;
            case 2:
                searchLogic.searchShoesCase2(t);
                break;
            case 3:
                searchLogic.searchShoesCase3(t);
                break;
            default:
                printText.defaultCase();
                break;
        }
    }
}
