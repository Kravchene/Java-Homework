package by.itacademy.courses.hw4;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int[] number = {545, -2100, 415, -10, 22, -35, -14, 45};
        int[] number1 =new int[8];
        int[] number2 =new int[8];
        Arrays.sort(number);
        for (int i = 0;i<number.length;i++){
            if(number[i]<0) {
                number1[i] = number[i];
            }
            if (number[i]>0){
                    number2[i]=number[i];
            }
        }
        for (int i = 0; i<number1.length;i++){
            if (number1[i]==0){
                continue;
            }
            System.out.print(number1[i]+" ");

        }
        System.out.println();
        for (int i = 0; i<number2.length;i++){
            if (number1[i]<0) {
                continue;
            }
            System.out.print(number2[i]+" ");
        }

    }
}