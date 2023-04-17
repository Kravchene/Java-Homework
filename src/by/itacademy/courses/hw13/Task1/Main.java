package by.itacademy.courses.hw13.Task1;

public class Main {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();
        myThread2.thread();
        myThread1.thread();
    }
}