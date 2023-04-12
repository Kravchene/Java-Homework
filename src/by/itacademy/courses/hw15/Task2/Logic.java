package by.itacademy.courses.hw15.Task2;

import java.util.Collection;

public class Logic {
    public static int minInt(Collection<Integer> a) {
        return a.stream().min(Integer::compare).get();
    }

    public static int maxInt(Collection<Integer> a) {
        return a.stream().max(Integer::compare).get();
    }

    public static int sumOfAllNumbers(Collection<Integer> a) {
        return a.stream().mapToInt(Integer::intValue).sum();
    }

    public static double arithmetic(Collection<Integer> a, double b) {
        return b / a.size();
    }

    public static double theProductOfNumbers(Collection<Integer> number) {
        return number.stream()
                .mapToDouble(a -> a)
                .reduce(1, (a, b) -> a * b);
    }

    public static int sumOfAllDigits(Collection<Integer> number) {
        return number.stream()
                .map(x -> Integer.toString(x))
                .flatMapToInt(CharSequence::chars)
                .map(Character::getNumericValue)
                .sum();
    }
}
