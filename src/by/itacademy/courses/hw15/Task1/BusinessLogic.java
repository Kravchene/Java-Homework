package by.itacademy.courses.hw15.Task1;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class BusinessLogic {
    static List<String> searchWordsAll(Collection<String> a) {
        return a.stream()
                .flatMap(line -> Arrays.stream(line.split(" ")))
                .map(line -> line.replaceAll("[^a-zA-Z]", ""))
                .filter(line -> line.length() > 0)
                .distinct()
                .collect(Collectors.toList());
    }

    public static void searchForSpaces(Collection<String> a) {
        boolean search = true;
        Pattern pattern = Pattern.compile("[:;!.?,]|\\s+");
        for (String t : a) {
            Matcher matcher = pattern.matcher(t);
            if (!matcher.find()) {
                search = matcher.find();
                System.out.println("строка не содержат пробелов и знаков препинания : " + t);
            }
        }
        if (search) {
            System.out.println("строк не содержат пробелов и знаков препинания нет ");
        }
    }

    static void searchWordsMethod(String a, Collection<String> b) {
        boolean textFalse = false;
        for (String t : b) {
            List<String> text = List.of(t.split("\\s*[.!?,-]\\s*|\\s"));
            boolean contain = text.stream()
                    .anyMatch(s -> s.equals("login"));
            if (contain) {
                System.out.printf("Слова \"%s\" было найдено в тексте ", a);
                textFalse = true;
            }
        }
        if (!textFalse) {
            System.out.printf("Слова \"%s\" не найдено в тексте ", a);
        }
    }


    static void maxLengthWords(Collection<String> a) {
        System.out.println();
        System.out.print("Самая длинная строка: " + a.stream()
                .max(Comparator.comparingInt(String::length)));
    }

    static void minLengthWords(Collection<String> a) {
        System.out.println();
        System.out.print("Самая короткая строка: " + a.stream()
                .min(Comparator.comparingInt(String::length)));
    }
}
