package by.itacademy.courses.hw3;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите три целых числа: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        Numbers1(a, b, c);
        Numbers2(a, b, c);
        Numbers3(a, b, c);

    }

    static void Numbers1(int a, int b, int c) {
        if (a < b & a < c) {
            System.out.println(a);
        } else if (c < b & c < a) {
            System.out.println(c);
        } else if (b < c & b < a) {
            System.out.println(b);
        }
    }

    static void Numbers2(int a, int b, int c) {

        if ( a < b &  a > c || a > b &  a < c) {
            System.out.println(a);
        } else if (b < a &  b > c || b > a &  b < c) {
            System.out.println(b);
        } else if (c < b &  c > a || c > b &  c < a) {
            System.out.println(c);
        }
    }
    static void Numbers3(int a, int b, int c) {
        if (a > b & a > c) {
            System.out.println(a);
        } else if (c > b & c > a) {
            System.out.println(c);
        } else if (b > c & b > a) {
            System.out.println(b);
        }
    }
}
