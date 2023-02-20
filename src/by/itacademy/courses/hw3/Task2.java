package by.itacademy.courses.hw3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите нечетное положительное или четное отрицательное число: ");
        int number = in.nextInt();
        evenOrNotEven(number);
    }

    static void evenOrNotEven(int number){
        if (number<0 && number%2==0){
            System.out.println("Четное отрицательное число");
        } else if (number > 0 && number%2 != 0){
            System.out.println("Нечетное положительное число");
        }
    }
}
