package by.itacademy.courses.hw13.Task2;

import java.util.Arrays;

public class MyThreadMin extends Thread {
    @Override
    public void run() {
        Arrays.sort(Main.Number);
        System.out.println("Минимальный элемент массива: " + Main.Number[0]);
    }
}
