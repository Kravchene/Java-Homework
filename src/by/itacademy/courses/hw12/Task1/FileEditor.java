package by.itacademy.courses.hw12.Task1;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FileEditor {
    int[] a = new int[1000];
    int[] b = new int[1000];
    String number1 = null;
    String number2 = null;


    void randomNumber() {
        for (int i = 0; i < 1000; i++) {
            a[i] = (int) ((Math.random() * ((100000 - 1))));
            b[i] = (int) ((Math.random() * ((100000 - 1))));
        }
    }

    void writer1()   {
        try {
            FileWriter in1 = new FileWriter("D:\\Java-Homework\\Java-Homework\\src\\by\\itacademy\\courses\\hw12\\Task1\\in1.txt");
            FileWriter in2 = new FileWriter("D:\\Java-Homework\\Java-Homework\\src\\by\\itacademy\\courses\\hw12\\Task1\\in2.txt");
            int len1 = a.length;
            int len2 = b.length;
            for (int i = 0; i < len1; i++) {
                in1.write(a[i] + " ");
            }
            for (int i = 0; i < len2; i++) {
                in2.write(b[i] + " ");
            }
            in1.close();
            in2.close();
        } catch (
                IOException w) {
            System.out.println(w.getMessage());
        }
    }

    void reader() {
        try {
            FileReader in1 = new FileReader("D:\\Java-Homework\\Java-Homework\\src\\by\\itacademy\\courses\\hw12\\Task1\\in1.txt");
            FileReader in2 = new FileReader("D:\\Java-Homework\\Java-Homework\\src\\by\\itacademy\\courses\\hw12\\Task1\\in2.txt");
            int i = -1;
            String text1 = "";
            String text2 = "";
            while ((i = in1.read()) != -1) {
                text1 += (char) i;
            }
            while ((i = in2.read()) != -1) {
                text2 += (char) i;
            }
            number1 = text1;
            number2 = text2;
            in1.close();
            in2.close();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    void writer2() {
        String test = number1 + number2;
        String[] test1 = test.split(" ");
        int[] arr2 = new int[test1.length];
        for (int i = 0; i < test1.length; i++) {
            arr2[i] = Integer.parseInt(test1[i]);
        }
        Arrays.sort(arr2);
        try {
            FileWriter fileWriter = new FileWriter("D:\\Java-Homework\\Java-Homework\\src\\by\\itacademy\\courses\\hw12\\Task1\\out.txt");
            int len = arr2.length;
            for (int i = 0; i < len; i++) {
                fileWriter.write(arr2[i] + " ");
            }
        } catch (IOException v) {
            System.out.println(v.getMessage());
        }
    }
}

