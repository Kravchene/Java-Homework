package by.itacademy.courses.hw13.Task2;

import java.util.Arrays;

public class MyThreadMax extends Thread {
    public void run(double[] a) {
        Arrays.sort(a);
        System.out.println("Минимальный элемент массива: " + a[a.length - 1]);
    }
}
