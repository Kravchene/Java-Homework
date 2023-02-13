package by.itacademy.courses.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите три целых числа");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        numbersMin(a, b, c);
        numbers2(a, b, c);
        numbersMax(a, b, c);
        System.out.println();
        test(a, b, c);
    }

    static void numbersMin(int a, int b, int c) {
        if (a < b & a < c) {
            System.out.println(a);
        } else if (c < b & c < a) {
            System.out.println(c);
        } else if (b < c & b < a) {
            System.out.println(b);
        }
    }

    static void numbers2(int a, int b, int c) {

        if ( a < b &  a > c || a > b &  a < c) {
            System.out.println(a);
        } else if (b < a &  b > c || b > a &  b < c) {
            System.out.println(b);
        } else if (c < b &  c > a || c > b &  c < a) {
            System.out.println(c);
        }
    }

    static void numbersMax(int a, int b, int c) {
        if (a > b & a > c) {
            System.out.println(a);
        } else if (c > b & c > a) {
            System.out.println(c);
        } else if (b > c & b > a) {
            System.out.println(b);
        }
    }
    static void test(int a,int b,int c){
        int[] number = new int[3];
        number[0]=a;
        number[1]=b;
        number[2]=c;
        Arrays.sort(number);
        for (int result : number){
            System.out.println(result);
        }//так ещё будет проще
    }
}
