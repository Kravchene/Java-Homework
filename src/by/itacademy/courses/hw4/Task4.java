package by.itacademy.courses.hw4;
public class Task4 {
    public static void main(String[] args) {
        int[] number = new int[]{1534,5,234,23,767,12120,8,9};
        getMinOrMax(number);


    }
    public static void getMinOrMax(int[] number){
        int maxNumber = number[0];
        int minNumber = number[0];
        int index1 = 0;
        int index2 = 0;
        for(int i=0;i < number.length;i++){
            if(number[i] > maxNumber){
            maxNumber = number[i];
            index1 = i;}
            if (number[i] < minNumber) {
                minNumber = number[i];
                index2 = i;}}
        System.out.println("Максимальный  элементы массива: "+maxNumber+"\n"+"Индекс: "+index1+"\n"+
                "Минимальный элемент массива: "+minNumber+"\n"+"Индекс: "+index2);

        }
    }

