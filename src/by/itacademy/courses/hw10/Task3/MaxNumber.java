package by.itacademy.courses.hw10.Task3;

import java.util.Deque;

public class MaxNumber {
    static Double max(Deque<Double> deque) {
        Double number = 0.0;
        for (Double a : deque) {
            if (number < a) {
                number = a;
            }
        }
        return number;
    }
}
