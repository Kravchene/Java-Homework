package by.itacademy.courses.hw4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = in.nextInt();
        System.out.println(sum(number)+"\n"+multiplication(number));
    }

    static int sum (int number){
        int core = 0;
        while (number != 0) {
            core =core+number%10;
            number /= 10;
        }
        return core;
    }

    static int multiplication (int number) {
        int core = 1;
        while (number != 0) {
            core = core * (number%10);
            number = number / 10;
        }
        return core;
    }
}

