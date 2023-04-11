package by.itacademy.courses.hw10.Task3;

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Deque<Double> deque = new ArrayDeque<>();
        deque.push(2412.4);
        deque.push(34.5);
        deque.push(1.24);
        System.out.println(MaxNumber.max(deque));
        System.out.println(deque);
        deque.pop();
        System.out.println(deque);
    }
}
