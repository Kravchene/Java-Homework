package by.itacademy.courses.hw7;

public class Fahrenheit  {
    static double fahrenheit;

    Fahrenheit(double fahrenheit){
        this.fahrenheit=fahrenheit;
    }
public double convert(){
    double number=0;
    number=(fahrenheit*9/5) + 32;
    return number;
}
}
