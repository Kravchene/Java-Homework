package by.itacademy.courses.hw15.Task3;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingLogic {
    public List<String> sortingLogic(List<String> a) {
        return a.stream()
                .filter(str -> !str.contains("3"))
                .sorted(Comparator.comparing(s -> Integer.parseInt(s.substring(1))))
                .skip(1)
                .limit(a.size() - 2)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }
}
