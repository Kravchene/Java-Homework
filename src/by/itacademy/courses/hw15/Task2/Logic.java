package by.itacademy.courses.hw15.Task2;



import java.util.Collection;
import java.util.stream.Stream;

public class Logic {
    public static int minInt(Stream<Integer> a) {
        return a.min(Integer::compare).orElse(0);
    }

    public static int maxInt(Stream<Integer> a) {
        return a.max(Integer::compare).orElse(0);
    }

    public static int sumOfAllNumbers(Stream<Integer> a) {
        return a.mapToInt(Integer::intValue).sum();
    }

    public static double arithmetic(Collection<Integer> a, double b) {
        return b / a.size();
    }

    public static double theProductOfNumbers(Stream<Integer> number) {
        return number.mapToDouble(a -> a)
                .reduce(1, (a, b) -> a * b);
    }

    public static int sumOfAllDigits(Stream<Integer> number) {
        return number.map(x -> Integer.toString(x))
                .flatMapToInt(CharSequence::chars)
                .map(Character::getNumericValue)
                .sum();
    }
}
