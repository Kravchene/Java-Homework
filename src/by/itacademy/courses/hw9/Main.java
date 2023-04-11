package by.itacademy.courses.hw9;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String number = in.nextLine();
        String[] words = Search.splitText(number);
        double a = Double.parseDouble(words[0]);
        double b = Double.parseDouble(words[1]);
        Calculator<Double, Double, String> calculator = new Calculator<>(a, b, Search.search(number));
        calculator.sad();
        System.out.println();

        Pair<String, String> pair = new Pair<>("Инь", "Ян");
        System.out.println(pair.getYan() + " " + pair.getYin());
        pair.setYan("Свет");
        pair.setYin("Тьма");
        System.out.println(pair);
        pair.swap();
        System.out.println(pair);
    }
}