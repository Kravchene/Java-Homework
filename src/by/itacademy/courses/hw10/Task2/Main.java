package by.itacademy.courses.hw10.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Введите любой текст");
        Scanner in = new Scanner(System.in);
        Search.setText(in.nextLine());
        System.out.println(Search.searchInTheText());

    }
}
