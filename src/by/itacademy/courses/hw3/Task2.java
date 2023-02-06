package by.itacademy.courses.hw3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int a = number.nextInt();
        evenOrNotEven(a);
    }
    static void evenOrNotEven(int a){
        if (a%2==0){
            System.out.println("чётное");
        } else {
            System.out.println("нечётное");
        }
    }
}
