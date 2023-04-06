package by.itacademy.courses.hw10.Task1;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer> result1 = new TreeSet<>();
        result1.add(1);
        result1.add(15616);
        result1.add(213);
        Set<Integer> result2 = new TreeSet<>();
        result2.add(1123);
        result2.add(16);
        result2.add(213);
        System.out.println(MergesAndIntersections.union(result1, result2));
        System.out.println(MergesAndIntersections.intersect(result1, result2));
    }
}
