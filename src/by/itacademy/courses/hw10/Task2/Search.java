package by.itacademy.courses.hw10.Task2;

import java.util.HashMap;
import java.util.Map;

public class Search {
    private static String text;

    private Search(String text) {
        Search.text = text;
    }

    public static void setText(String text) {
        Search.text = text;
    }

    public static String getText() {
        return text;
    }

    static Map<String, Integer> searchInTheText() {
        String textLowercase = getText().toLowerCase();
        String regex = "\\s|\\.|,|!|\\?";
        Map<String, Integer> map = new HashMap<>();
        for (String word : textLowercase.split(regex)) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        return map;
    }
}
