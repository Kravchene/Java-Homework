package by.itacademy.courses.hw13.Task2;

public class Main {
    public static double[] Number=FillingTheArray.array();
    public static void main(String[] args) {
        MyThreadMin myThreadMin = new MyThreadMin();
        MyThreadMax myThreadMax = new MyThreadMax();
        myThreadMin.start();
        myThreadMax.start();
    }
}
