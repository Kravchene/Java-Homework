package by.itacademy.courses.hw7.Task3;

class Fruit {
    private String fruit;
    private double weight;
    private double fruitPrice;

    Fruit(String fruit, double weight, double fruitPrice) {
        this.weight = weight;
        this.fruit = fruit;
        this.fruitPrice = fruitPrice;
    }

    double price(double weight) {
        return fruitPrice * weight;
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getFruitPrice() {
        return fruitPrice;
    }

    public void setFruitPrice(double fruitPrice) {
        this.fruitPrice = fruitPrice;
    }

    @Override
    public String toString() {
        return "fruit='" + fruit + '\'' +
                ", weight=" + weight +
                ", fruitPrice=" + fruitPrice;
    }
}

