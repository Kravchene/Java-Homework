package by.itacademy.courses.hw4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("введите число 1: ");
        int a = in.nextInt();

        System.out.print("введите число 2: ");
        int b = in.nextInt();

        int sum = a + b;
        int multiplier = a * b;

        System.out.println(a+"+"+b+"="+ sum);
        System.out.println(a+"*"+b+"="+ multiplier);
    }
}
