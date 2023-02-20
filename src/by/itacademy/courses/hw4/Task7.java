package by.itacademy.courses.hw4;

import java.util.Arrays;
import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        int[] number = new int[5];
        Random randomNumber = new Random();


        for (int i = 0; i < number.length; i++) {
            number[i] = randomNumber.nextInt();
            System.out.print(number[i] + ", ");
        }
        System.out.println();

        for (int i = 0; i < number.length / 2; i++) {
            int b = number[i];
            number[i] = number[number.length - 1 - i];
            number[number.length-1-i] = b;
        }
        for (int number1: number){
            System.out.print(number1+ ", ");
        }

    }
}