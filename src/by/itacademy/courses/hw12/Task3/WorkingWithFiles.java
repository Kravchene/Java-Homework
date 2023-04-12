package by.itacademy.courses.hw12.Task3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WorkingWithFiles {
    File file = new File("D:\\Java-Homework\\Java-Homework\\src\\by\\itacademy\\courses\\hw12\\Task3\\task3.txt");
    int[] number1 = new int[30];
    double a = 0;
    double b = 0;

    void input() {
        try (FileOutputStream fileOutputStream = new FileOutputStream(file)) {
            file.createNewFile();
            for (int i = 0; i < 30; i++) {
                number1[i] = (int) ((Math.random() * ((100 - 1))));
                a += number1[i];
            }
            b = a / 30;
            for (int i = 0; i < 30; i++) {
                fileOutputStream.write(number1[i]);
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    void output() {
            for (int readableNumbers : number1) {
                System.out.println(readableNumbers);
            }
        System.out.println("среднее арифметическое: " + b);
    }
}
