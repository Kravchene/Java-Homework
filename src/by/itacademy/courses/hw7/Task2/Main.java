package by.itacademy.courses.hw7.Task2;

public class Main {
    public static void main(String[] args) {
        double celsius= 10.0;
        Kelvins kelvins=new Kelvins(celsius);
        kelvins.temperatureConversion();
        Fahrenheit fahrenheit = new Fahrenheit(celsius);
        fahrenheit.temperatureConversion();

    }
}
