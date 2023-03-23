package by.itacademy.courses.hw8.Task1;

public class Main {
    public static void main(String[] args) {
        Food food = new Food("a");
        Cookable cookable = new Cookable() {
            @Override
            public void cook(String str) {
                System.out.println("cook");
            }
        };
        food.prepare(cookable, food.str);
    }
}
