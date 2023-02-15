package by.itacademy.courses.hw4;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] number = new int[]{1534,5,234,23,767,12120,8,9};
        int max = getMax (number);
        int min = getMin (number);
        System.out.println("Максимальный  элементы массива: "+max);
        System.out.println("Минимальный элемент массива: "+min);
        System.out.println(Arrays.binarySearch(number,max));
        System.out.println(Arrays.binarySearch(number,min));
        System.out.println();
        numberMinOrMax(number);

    }
    public static int getMax(int[] number){
        int maxNumber = number[0];
        for(int i=0;i < number.length;i++){
            if(number[i] > maxNumber){
            maxNumber = number[i];}}
        return maxNumber;
    }

    public static int getMin(int[] number){
        int minNumber = number[0];
        for(int i=0;i<number.length;i++) {
            if (number[i] < minNumber) {
                minNumber = number[i];}}
        return minNumber;
    }

    static void numberMinOrMax(int[] number){
        Arrays.sort(number);
        int max =number[number.length-1];
        int min =number[number.length-number.length];
        System.out.println("Максимальный  элементы массива: "+max);
        System.out.println("Минимальный элемент массива: "+min);
        int maxIndex = Arrays.binarySearch(number,max);
        int minIndex = Arrays.binarySearch(number,min);
        System.out.println(maxIndex);
        System.out.println(minIndex);
    }
}
