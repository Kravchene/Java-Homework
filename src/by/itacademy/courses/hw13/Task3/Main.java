package by.itacademy.courses.hw13.Task3;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        Thread myThread1 = new Thread(myThread);
        Thread myThread2 = new Thread(myThread);
        Thread myThread3 = new Thread(myThread);
        myThread1.start();
        myThread2.start();
        myThread3.start();
    }
}
