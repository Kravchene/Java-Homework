package by.itacademy.courses.hw3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число от 0 до 59: ");
        int Numbers = in.nextInt();
        Time(Numbers);
    }
    static void Time (int Numbers){
        if(Numbers<=14 & Numbers> -1){
            System.out.println("Первая часть часа");
        } else if (Numbers>14 & Numbers<=29){
            System.out.println("Вторая часть часа");
        } else if (Numbers>29 & Numbers<=44){
            System.out.println("Третья часть часа");
        } else if (Numbers>44 & Numbers<=59){
            System.out.println("Четвёртая часть часа");
        }else {
            System.out.println("Ошибка");
        }
    }
}
