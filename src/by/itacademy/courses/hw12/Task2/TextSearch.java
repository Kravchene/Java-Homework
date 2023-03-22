package by.itacademy.courses.hw12.Task2;

import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextSearch {
    String text = null;

    void reader() {
        try {
            FileReader fileReader = new FileReader("D:\\Java-Homework\\Java-Homework\\src\\by\\itacademy\\courses\\hw12\\Task2\\text.txt");
            int i = -1;
            String text1 = "";
            while ((i = fileReader.read()) != -1) {
                text1 += (char) i;
            }
            text = text1;
            fileReader.close();
            System.out.println(text1);

        } catch (IOException a) {
            System.out.println(a.getMessage());
        }
    }

    void counter() {
        assert text != null;
        String[] a = text.split("\\s|\\.|!|\\?|,\\s|,");
        Pattern pattern = Pattern.compile("[.!,?]");
        Matcher matcher = pattern.matcher(text);
        int b = 0;
        while (matcher.find()) {
            b++;
        }
        System.out.println("Количество слов: " + a.length);
        System.out.println("Количество знаков препинания: " + b);
    }
}
