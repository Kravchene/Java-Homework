package by.itacademy.courses.hw14.Task1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Как часто выводить текущее время?");
        System.out.print("Укажите время в секундах: ");
        ShowTime time = new ShowTime();
        time.start();

    }
}
