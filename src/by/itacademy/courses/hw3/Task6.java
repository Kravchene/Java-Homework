package by.itacademy.courses.hw3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        System.out.println("Нам нужно узначить возможен ли такой треугольник!");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину первой стороны треугольника: ");
        int a = in.nextInt();
        System.out.print("Введите длину второй стороны треугольника: ");
        int b = in.nextInt();
        System.out.print("Введите длину третьей стороны треугольника: ");
        int c = in.nextInt();
        int sum1 = a + b;
        int sum2 = a + c;
        int sum3 = c + b;
        if (a<sum3 && b<sum2 && c<sum1){
            System.out.println("Такой треугольник существовать не может");
        }else {
            System.out.println("Тактакой треугольник может существовать ");
        }

    }
}
