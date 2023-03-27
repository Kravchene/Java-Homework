package by.itacademy.courses.hw13.Task2;

import java.util.Scanner;

public class FillingTheArray {
    double[] Array() {
        Scanner scanner = new Scanner(System.in);
        double[] number = new double[3];
        System.out.println("Введите 3 числа");
        number[0] = scanner.nextInt();
        number[1] = scanner.nextInt();
        number[2] = scanner.nextInt();
        return number;
    }
}
