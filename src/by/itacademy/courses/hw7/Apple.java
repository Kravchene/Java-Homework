package by.itacademy.courses.hw7;

public class Apple extends Fruits {
    double priceApple;

    Apple(double weight, double priceApple) {
        super(weight);
        this.priceApple = priceApple;
    }

    @Override
    public double price(double weight) {
        double number = priceApple * weight;
        return number;
    }
}