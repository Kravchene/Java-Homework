package by.itacademy.courses.hw15.Task3;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingLogic {
    public List<String> deleteLogic(List<String> a) {
        List<String> list = a.stream()
                .filter(str -> !str.contains("3"))
                .collect(Collectors.toList());
        return list;
    }

    public List<String> sortingLogic(List<String> a) {
        List<String> list = a.stream()
                .sorted(Comparator.comparing(s -> Integer.parseInt(s.substring(1))))
                .collect(Collectors.toList());
        return list;
    }

    public List<String> sortingLogic2(List<String> a, List<String> b) {
        List<String> list = a.stream()
                .skip(1)
                .limit(b.size() - 2)
                .collect(Collectors.toList());
        return list;
    }

    public void uppercaseLogic(List<String> a) {
        List<String> List = a.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(List);
    }
}
