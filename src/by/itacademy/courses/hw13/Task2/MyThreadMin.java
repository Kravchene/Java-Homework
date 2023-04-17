package by.itacademy.courses.hw13.Task2;

import java.util.Arrays;

public class MyThreadMin extends Thread {
    public void run(double[] a) {
        Arrays.sort(a);
        System.out.println("Mаксимальный элемент массива: " + a[0]);
    }
}
