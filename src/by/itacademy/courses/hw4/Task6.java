package by.itacademy.courses.hw4;

public class Task6 {
    public static void main(String[] args) {
        int[] number = {545, -2100, 415, -10, 22, -35, -14, 45};
        int positiveElements = 0, negativeElements = 0;

        for (int sortingPositiveOrNegative : number) {
            if (sortingPositiveOrNegative > 0) {
                positiveElements++;
            } else {
                negativeElements++;
            }
        }
        int[] positiveNumber = new int[positiveElements];
        int[] negativeNumber = new int[negativeElements];

        test2(number, positiveNumber, negativeNumber);
        test3(positiveNumber, negativeNumber);
    }

    static void test2(int number[],int[] positiveNumber,int[] negativeNumber) {
        int number1 = 0, number2 = 0;
        for (int sorting : number) {
            if (sorting > 0) {
                positiveNumber[number1] = sorting;
                number1++;
            } else {
                negativeNumber[number2] = sorting;
                number2++;
            }
        }
    }
    static void test3(int[] positiveNumber,int[] negativeNumber){
        for (int sorting :positiveNumber){
            System.out.print(sorting+", ");
        }
        System.out.println();

        for (int sorting :negativeNumber){
            System.out.print(sorting+", ");
        }
    }
}

