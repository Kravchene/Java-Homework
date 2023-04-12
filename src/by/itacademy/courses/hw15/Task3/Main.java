package by.itacademy.courses.hw15.Task3;

import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a1", "a2", "a3", "b1", "b3", "c2", "c1", "c5");
        SortingLogic sortingLogic = new SortingLogic();
       sortingLogic.uppercaseLogic(sortingLogic.sortingLogic2(sortingLogic.sortingLogic(sortingLogic.deleteLogic(list)), list));
    }
}
