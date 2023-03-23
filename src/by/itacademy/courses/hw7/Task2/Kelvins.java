package by.itacademy.courses.hw7.Task2;

public class Kelvins implements Degree {
    double Celsius;

    Kelvins(double Celsius) {
        this.Celsius = Celsius;
    }

    @Override
    public double convert() {
        double number = 0;
        number = +Celsius + 273.15;
        return number;
    }

    @Override
    public void temperatureConversion() {
        System.out.println("Температура в кельвинах: " + convert());
    }
}
