package by.itacademy.courses.hw6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task2 {
    public static void main(String[] args) {
        String text = "столов 251 на собрании 45464454554 людей простых рабочих 5151452 и 151561534 ";
        Pattern pattern = Pattern.compile("\\w+");
        Matcher matcher = pattern.matcher(text);
        String maxNumber = null;
        int number =0;
        while (matcher.find()) {
            int numLength = text.substring(matcher.start(),matcher.end()).length();
            if (numLength > number) {
                number = numLength;
                maxNumber = text.substring(matcher.start(),matcher.end());
            }
        }
        System.out.println(maxNumber);
    }
}