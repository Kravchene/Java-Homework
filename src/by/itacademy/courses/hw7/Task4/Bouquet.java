package by.itacademy.courses.hw7.Task4;

import java.util.ArrayList;
import java.util.List;

public class Bouquet {
    public List<Flower> listFlower = new ArrayList<>();
    List<Double> listDoubles = new ArrayList<>();

    void colour() {
        String colour = "";
        for (Flower a : listFlower) {
            colour = colour + a.getColour() + ", ";
        }
        System.out.println("Букет состоит из следующих цветов: " + colour);
    }

    void lifetime() {
        int lifetimeMax = 0;
        for (Flower a : listFlower) {
            if (a.getLifetime() > lifetimeMax) {
                lifetimeMax = a.getLifetime();
            }
        }
        System.out.println("Букет будет жить: " + lifetimeMax + " дней");
    }

    public void addFlower(String flowerName, double price, String colour, int lifetime) {
        listFlower.add(new Flower(flowerName, price, colour, lifetime));
        listDoubles.add(price);
    }

    public void cost() {
        double costFlower = 0;
        for (Double a : listDoubles) {
            costFlower = a + costFlower;
        }
        System.out.println("Общая стоимость букета: " + costFlower + " BYN");
    }

}
