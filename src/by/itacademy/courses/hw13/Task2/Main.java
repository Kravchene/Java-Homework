package by.itacademy.courses.hw13.Task2;

public class Main {
    public static void main(String[] args) {
        FillingTheArray fillingTheArray = new FillingTheArray();
        double[] number = fillingTheArray.array();

        MyThreadMin myThreadMin = new MyThreadMin();
        MyThreadMax myThreadMax = new MyThreadMax();
        myThreadMin.run(number);
        myThreadMax.run(number);
        myThreadMin.start();
        myThreadMax.start();
    }
}