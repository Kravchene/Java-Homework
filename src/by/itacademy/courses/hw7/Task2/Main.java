package by.itacademy.courses.hw7.Task2;

public class Main {
    public static void main(String[] args) {
        double celsius = 10.0;
        Kelvin kelvins = new Kelvin(celsius);
        kelvins.convert();
        Fahrenheit fahrenheit = new Fahrenheit(celsius);
        fahrenheit.convert();

    }
}
