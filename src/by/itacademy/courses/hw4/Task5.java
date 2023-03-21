package by.itacademy.courses.hw4;

public class Task5 {
    public static void main(String[] args) {
        int[] number = new int[]{345, 234, 23, 8, 12123, 10, 6, 9};
        System.out.println(getMin(number));
    }

    public static int getMin(int[] number) {
        int minNumber = number[0];
        for (int i = 1; i < number.length; i=i+2) {
            if (number[i] < minNumber) {
                minNumber = number[i];
            }
        }
        return minNumber;
    }
}