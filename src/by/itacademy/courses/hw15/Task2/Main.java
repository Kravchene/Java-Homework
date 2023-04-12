package by.itacademy.courses.hw15.Task2;

import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Collection<Integer> col = new ArrayList<>();
        col.add(31);
        col.add(25);
        col.add(35);
        col.add(79);
        col.add(3);
        col.add(8);
        col.add(89);
        col.add(16);
        System.out.println("Минимальный элемент коллекции " + Logic.minInt(col));
        System.out.println("Максимальный элемет коллекции " + Logic.maxInt(col));
        System.out.println("Сумма всех чисел: "+Logic.sumOfAllNumbers(col));
        System.out.println("Среднее арифметическое чисел: "+Logic.arithmetic(col,Logic.sumOfAllNumbers(col)));
        System.out.println("произведение всех чисел: "+Logic.theProductOfNumbers(col));
        Logic.sumOfAllDigits(col);
        System.out.println("сумму всех цифр: "+Logic.sumOfAllDigits(col));

    }
}
