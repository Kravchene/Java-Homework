package by.itacademy.courses.hw7.Task3;

public class Basket {
    Fruit[] fruits = new Fruit[]{new Fruit("apricot", 3.1, 4.6),
            new Fruit("apple", 5.5, 3.6),
            new Fruit("pear", 3.5, 7)};
    Double[] doubles = new Double[]{fruits[0].weight, fruits[1].weight, fruits[2].weight};

    public double cost() {
        return fruits[0].price(doubles[0]) + fruits[1].price(doubles[1]) + fruits[2].price(doubles[2]);
    }

    public void basketPrice() {
        System.out.println("Общая стоимость фруктов в корзине: " + cost() + "BYN\n" + "Общая цена яблок: " + fruits[0].price(doubles[0]) + "BYN\n" +
                "Общая цена груш: " + fruits[1].price(doubles[1]) + "BYN\n" + "Общая цена абрикосов: " + fruits[2].price(doubles[2]) + "BYN");
    }

    void printManufacturerInfo() {
        System.out.print("Made in Belarus");
    }
}
