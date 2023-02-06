package by.itacademy.courses.hw3;
import java.util.*;

public class Task8 {
    public static void main(String[] args) {
        Watch();
    }
    static void Watch() {
        Random in=new Random();
        int Numbers= in.nextInt(28800);
        int b = 28800- Numbers;
        if (Numbers == 0) {
            System.out.println("Рабочий день ещё не начился осталось 28000");
            System.out.println("Рабочий день ещё не начился осталось 8 часа");
        } else if (Numbers > 0 & Numbers < 3599) {
            System.out.println("Осталось: " +b+" секунд до конца рабочего дня");
            System.out.println("Осталось 7 часа");
        } else if (Numbers > 3600 & Numbers < 7199) {
            System.out.println("Осталось: " +b+" секунд до конца рабочего дня");
            System.out.println("Осталось 6 часа");
        } else if (Numbers > 7200 & Numbers < 10799) {
            System.out.println("Осталось: " +b+" секунд до конца рабочего дня");
            System.out.println("Осталось 5 часа");
        } else if (Numbers > 10800 & Numbers < 14399) {
            System.out.println("Осталось: " +b+" секунд до конца рабочего дня");
            System.out.println("Осталось 4 часа");
        } else if (Numbers > 14400 & Numbers < 17999) {
            System.out.println("Осталось: " +b+" секунд до конца рабочего дня");
            System.out.println("Осталось 3 часа");
        } else if (Numbers > 18000 & Numbers < 21599) {
            System.out.println("Осталось: " +b+" секунд до конца рабочего дня");
            System.out.println("Осталось 2 часа");
        } else if (Numbers > 21600 & Numbers < 25199) {
            System.out.println("Осталось: " +b+" секунд до конца рабочего дня");
            System.out.println("Осталось 1 часа");
        } else if (Numbers > 25200 & Numbers < 28799) {
            System.out.println("Осталось: " +b+" секунд до конца рабочего дня");
            System.out.println("Осталось менее часа");
        } else if (Numbers==28800) {
            System.out.println("Осталось: " +b+" секунд до конца рабочего дня");
            System.out.println("Конец рабочего дня все свободны отдыхаете");
        }
    }
}