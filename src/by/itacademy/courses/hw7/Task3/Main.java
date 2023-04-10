package by.itacademy.courses.hw7.Task3;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket();
        basket.addFruit("apricot", 3.1, 4.6);
        basket.addFruit("apple", 5.5, 3.6);
        basket.addFruit("pear", 3.5, 7);
        basket.basketPrice();
        basket.printManufacturerInfo();
    }
}