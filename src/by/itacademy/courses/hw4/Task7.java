package by.itacademy.courses.hw4;

import java.util.Random;

public class Task7 {
    public static void main(String[] args) {
        int[] number = new int[5];
        Random randomNumber = new Random();
        number[0] = randomNumber.nextInt();
        number[1] = randomNumber.nextInt();
        number[2] = randomNumber.nextInt();
        number[3] = randomNumber.nextInt();
        number[4] = randomNumber.nextInt();
        for ( int numberResult : number){
            System.out.print(numberResult+", ");
        }
        System.out.println();
        for (int i= number.length-1;i>=0;i--){
            System.out.print(number[i]+", ");
        }


    }
}
