package by.itacademy.courses.hw3;
import java.util.*;

public class Task8 {
    public static void main(String[] args) {
        workHours();
    }
    static void workHours() {
        Random in=new Random();
        int numbers= in.nextInt(28800);
        int time = 28800- numbers;
        if (numbers == 0) {
            System.out.println("Рабочий день ещё не начился осталось 28000");
            System.out.println("Рабочий день ещё не начился осталось 8 часа");
        } else if (numbers < 3599) {
            System.out.println("Осталось: " +time+" секунд до конца рабочего дня");
            System.out.println("Осталось 7 часа");
        } else if (numbers > 3600 && numbers < 7199) {
            System.out.println("Осталось: " +time+" секунд до конца рабочего дня");
            System.out.println("Осталось 6 часа");
        } else if (numbers > 7200 && numbers < 10799) {
            System.out.println("Осталось: " +time+" секунд до конца рабочего дня");
            System.out.println("Осталось 5 часа");
        } else if (numbers > 10800 && numbers < 14399) {
            System.out.println("Осталось: " +time+" секунд до конца рабочего дня");
            System.out.println("Осталось 4 часа");
        } else if (numbers > 14400 && numbers < 17999) {
            System.out.println("Осталось: " +time+" секунд до конца рабочего дня");
            System.out.println("Осталось 3 часа");
        } else if (numbers > 18000 && numbers < 21599) {
            System.out.println("Осталось: " +time+" секунд до конца рабочего дня");
            System.out.println("Осталось 2 часа");
        } else if (numbers > 21600 && numbers < 25199) {
            System.out.println("Осталось: " +time+" секунд до конца рабочего дня");
            System.out.println("Осталось 1 часа");
        } else if (numbers > 25200 && numbers < 28799) {
            System.out.println("Осталось: " +time+" секунд до конца рабочего дня");
            System.out.println("Осталось менее часа");
        } else if (numbers==28800) {
            System.out.println("Осталось: " +time+" секунд до конца рабочего дня");
            System.out.println("Конец рабочего дня все свободны отдыхаете");
        }
    }
}