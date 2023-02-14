package by.itacademy.courses.hw3;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Вводит два целых однозначных числа");
        System.out.print("Первое число: ");
        int number1 = in.nextInt();
        System.out.print("Второе число: ");
        int number2 = in.nextInt();
        int increase =number1 * number2;
        System.out.print("Каков результат умножения первого числа на второе?\n"+number1+"*"+number2+"=");
        int answer = in.nextInt();
        if (increase == answer && number1>=0 && number1<=9 && number2>=0 && number2<=9){
            System.out.println("Правильно");
        } else if (increase != answer && number1>=0 && number1<=9 && number2>=0 && number2<=9 ){
            System.out.println("Неправильно!\nОтвет: " + increase);
        }else {
            System.out.println("Ошибка");
        }
    }
}
