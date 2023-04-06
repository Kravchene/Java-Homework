package by.itacademy.courses.hw10.Task2;

import java.util.HashMap;
import java.util.Map;

public class Search {
    Map searchInTheText(String text) {
        String textLowercase = text.toLowerCase();
        String regex = "\\s|\\.|,|!|\\?";
        Map<String, Integer> map = new HashMap<>();
        for (String word : textLowercase.split(regex)) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        return map;
    }
}
