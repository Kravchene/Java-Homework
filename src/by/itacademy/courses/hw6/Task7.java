package by.itacademy.courses.hw6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task7 {
    public static void main(String[] args) {
        String mail = "myemail@gmail.com , a.petrov@gmail.com.au ,coder4575@yandex.ru ";
        String regex = "\\w+?\\.?\\w+..@\\w+\\.\\w+\\.?\\w.\\w?";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(mail);
        while (matcher.find()){
            System.out.println(mail.substring(matcher.start(),matcher.end()));
        }
    }
}
