package by.itacademy.courses.hw7;

public class Kelvins{
    static double kelvins;

    Kelvins(double kelvins){
    this.kelvins=kelvins;
}
    public double convert() {
    double number=0;
    number=+kelvins+273.15;
        return number;
    }
}
