package by.itacademy.courses.hw13.Task1;

import static java.lang.Thread.sleep;

public class MyThread1 implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getState());
        try {
            sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

