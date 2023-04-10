package by.itacademy.courses.hw7.Task2;

public class Fahrenheit implements Degree {
    private double celsius;

    Fahrenheit(double celsius) {
        this.celsius = celsius;
    }

    @Override
    public void convert() {
        double number = 0;
        number = (celsius * 9 / 5) + 32;
        System.out.println("Температура в фаренгейтах: " + number);
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }
}
