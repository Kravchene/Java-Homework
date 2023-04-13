package by.itacademy.courses.hw15.Task2;


import java.util.Arrays;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        Integer[] number={31,25,25,7,3,8,89,16};
        Collection<Integer> col = Arrays.asList(number);
        System.out.println("Минимальный элемент коллекции " + Logic.minInt(col.stream()));
        System.out.println("Максимальный элемет коллекции " + Logic.maxInt(col.stream()));
        System.out.println("Сумма всех чисел: "+Logic.sumOfAllNumbers(col.stream()));
        System.out.println("Среднее арифметическое чисел: "+Logic.arithmetic(col,Logic.sumOfAllNumbers(col.stream())));
        System.out.println("произведение всех чисел: "+Logic.theProductOfNumbers(col.stream()));
        Logic.sumOfAllDigits(col.stream());
        System.out.println("сумму всех цифр: "+Logic.sumOfAllDigits(col.stream()));

    }
}
