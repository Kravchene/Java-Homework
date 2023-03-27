package by.itacademy.courses.hw13.Task1;

public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("I'm Thread! My name is " + getName());
    }

}
