package by.itacademy.courses.hw15.Task1;

import java.util.ArrayList;
import java.util.Collection;


public class Main {
    public static void main(String[] args) {
        Collection<String> col = new ArrayList<>();
        Collection<String> splitText = Text.textSplit();
        String searchWords = "login";
        BusinessLogic.searchWordsMethod(searchWords, splitText);
        BusinessLogic.maxLengthWords(col);
        BusinessLogic.minLengthWords(col);
        System.out.println();
        BusinessLogic.searchForSpaces(splitText);
        System.out.println();
        System.out.print("все слова используемые в тексте: ");
        System.out.println(BusinessLogic.searchWordsAll(splitText));
    }

}