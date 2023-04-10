package by.itacademy.courses.hw7.Task3;

import java.util.*;

public class Basket {
    public List<Fruit> listFruits = new ArrayList<>();
    List<Double> listDoubles = new ArrayList<>();

    public void addFruit(String fruit, double weight, double fruitPrice) {
        listFruits.add(new Fruit(fruit, weight, fruitPrice));
        listDoubles.add(weight);
    }

    public double cost() {
        double costFruit = 0;
        int i = 0;
        for (Double a : listDoubles) {
            costFruit = listFruits.get(i).price(a) + costFruit;
            i++;
        }
        return costFruit;
    }

    public void basketPrice() {
        int i = 0;
        System.out.println("Общая стоимость фруктов в корзине: " + cost() + " BYN");
        for (Fruit a : listFruits) {
            System.out.println("Общая цена " + a.getFruit() + ": " + listFruits.get(i).price(listDoubles.get(i)) + " BYN");
            i++;
        }
    }

    void printManufacturerInfo() {
        System.out.println("Made in Belarus");
    }
}
