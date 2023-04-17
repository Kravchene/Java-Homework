package by.itacademy.courses.hw8.Task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ClothingStore clothingStore = new ClothingStore();
        clothingStore.hello();
        clothingStore.creatingAndFillingCollection();
        Scanner scanner=new Scanner(System.in);
        clothingStore.shop(scanner.nextInt());
    }
}
