package by.itacademy.courses.hw13.Task3;

public class MyThread extends Thread {
    int number = 1;

    @Override
    public synchronized void run() {
        for (int i = 0; i < 100; i++) {
            System.out.print(number);
        }
        number++;
        System.out.println();
    }
}
