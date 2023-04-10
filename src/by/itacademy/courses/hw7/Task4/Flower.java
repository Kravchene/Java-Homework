package by.itacademy.courses.hw7.Task4;

public class Flower {
    private String flowerName;
    private double price;
    private String colour;
    private int lifetime;

    Flower(String flowerName, double price, String colour, int lifetime) {
        this.price = price;
        this.colour = colour;
        this.lifetime = lifetime;
        this.flowerName = flowerName;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public void setFlowerName(String flowerName) {
        this.flowerName = flowerName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getLifetime() {
        return lifetime;
    }

    public void setLifetime(int lifetime) {
        this.lifetime = lifetime;
    }

    @Override
    public String toString() {
        return "flowerName='" + flowerName + '\'' +
                ", price=" + price +
                ", colour='" + colour + '\'' +
                ", lifetime=" + lifetime;
    }
}

