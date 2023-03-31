package by.itacademy.courses.hw7.Task2;

public class Kelvin implements Degree {
    private double celsius;

    Kelvin(double celsius) {
        this.celsius = celsius;
    }

    @Override
    public void convert() {
        double number = 0;
        number = +celsius + 273.15;
        System.out.println("Температура в кельвинах: "+number);
    }

    public double getCelsius() {
        return celsius;
    }

    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }
}
