package by.itacademy.courses.hw7;

public class Apricots extends Fruits {
    double priceApricots;

    Apricots(double weight, double priceApricots) {
        super(weight);
        this.priceApricots=priceApricots;
    }

    @Override
    public double price(double weight) {
        double number = priceApricots * weight;
        return number;
    }
}