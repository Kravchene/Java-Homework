package by.itacademy.courses.hw7;

public class Pears extends Fruits{
    double pricePears;
    Pears(double weight,double pricePears) {
        super(weight);
        this.pricePears=pricePears;
    }

    @Override
    public double price(double weight) {
        double number=pricePears*weight;
        return number;
    }
}
