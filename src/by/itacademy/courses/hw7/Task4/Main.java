package by.itacademy.courses.hw7.Task4;

public class Main {
    public static void main(String[] args) {
        Bouquet bouquet = new Bouquet();
        bouquet.addFlower("Likoris", 5.5, "Red", 7);
        bouquet.addFlower("Rose",4.5, "Red", 8);
        bouquet.addFlower("Lily", 3.1, "white", 5);
        bouquet.cost();
        bouquet.colour();
        bouquet.lifetime();
    }
}
