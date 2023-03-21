package by.itacademy.courses.hw7.Task2;

public class Fahrenheit implements Degree  {
    double Celsius;

    Fahrenheit(double Celsius){
        this.Celsius=Celsius;
    }
    @Override
public double convert(){
    double number=0;
    number=(Celsius*9/5) + 32;
    return number;
}

    @Override
    public void temperatureConversion() {
        System.out.println("Температура в фаренгейтах: "+convert());
    }
}
