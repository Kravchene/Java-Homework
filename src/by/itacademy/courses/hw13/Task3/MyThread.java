package by.itacademy.courses.hw13.Task3;

public class MyThread extends Thread {

    public int run(int a) {
        for (int i = 0; i < 100; i++) {
            System.out.print(a);
        }
        System.out.println();
        return a + 1;
    }
}
