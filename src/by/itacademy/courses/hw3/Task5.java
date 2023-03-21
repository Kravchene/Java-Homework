package by.itacademy.courses.hw3;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число от 0 до 59: ");
        int numbers = in.nextInt();
        time(numbers);
    }
    static void time (int numbers){
        if(numbers<=14 && numbers> -1){
            System.out.println("Первая часть часа");
        } else if (numbers>14 && numbers<=29){
            System.out.println("Вторая часть часа");
        } else if (numbers>29 && numbers<=44){
            System.out.println("Третья часть часа");
        } else if (numbers>44 && numbers<=59){
            System.out.println("Четвёртая часть часа");
        }else {
            System.out.println("Ошибка");
        }
    }
}
