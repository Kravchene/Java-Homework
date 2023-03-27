package by.itacademy.courses.hw13.Task3;

public class Main {
    public static void main(String[] args) {
        int number = 1;
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        MyThread myThread3 = new MyThread();
        number = myThread1.run(number);
        number = myThread2.run(number);
        number = myThread3.run(number);
        myThread1.start();
        myThread2.start();
        myThread3.start();
    }
}
