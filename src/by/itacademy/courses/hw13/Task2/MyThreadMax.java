package by.itacademy.courses.hw13.Task2;

import java.util.Arrays;

public class MyThreadMax extends Thread {
    @Override
    public void run() {
        Arrays.sort(Main.Number);
        System.out.println("Mаксимальный элемент массива: " + Main.Number[Main.Number.length - 1]);
    }
}
