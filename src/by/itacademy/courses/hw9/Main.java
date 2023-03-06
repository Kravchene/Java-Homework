package by.itacademy.courses.hw9;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String number = in.next();
        String symbol=null;
        Pattern pattern = Pattern.compile("[-+/*]");
        Matcher matcher = pattern.matcher(number);
        while (matcher.find()) {symbol=  number.substring(matcher.start(),matcher.end());}
        String[] words = number.split("\\+|-|/|\\*");
        double a = Double.parseDouble(words[0]);
        double b = Double.parseDouble(words[1]);
        Calculator<Double, Double,String> calculator = new Calculator<>(a,b,symbol);
        calculator.sad();
        System.out.println();

        Pair<String> pair=new Pair<>("Инь","Ян");
        System.out.println(pair.getYan());
        System.out.println(pair.getYin());
        pair.setYan("Свет");pair.setYin("Тьма");
        System.out.println(pair.toString());
        pair.setYin(pair.yan);pair.setYan(pair.yin);
        System.out.println(pair.toString());
    }
}
