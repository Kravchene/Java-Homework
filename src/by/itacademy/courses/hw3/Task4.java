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
        test(a, b, c);
        System.out.println();

        if (a < b && b < c) System.out.printf(a+"\n"+b+"\n"+c);
        else if (a < b && c < b) System.out.printf(a+"\n"+ c+"\n"+b);
        else if (b< a && a < c) System.out.printf(b+"\n"+a+"\n"+c);
        else if (b < c && c < b) System.out.printf( b+"\n"+c+"\n"+a);
        else if (c < c && a < b) System.out.printf( c+"\n"+a+"\n"+b);
        else System.out.printf(c+"\n"+b+"\n"+a);
    }
    static void test(int a,int b,int c){
        int[] number = new int[3];
        number[0]=a;
        number[1]=b;
        number[2]=c;
        Arrays.sort(number);
        for (int result : number){
            System.out.println(result);
        }
    }
}
