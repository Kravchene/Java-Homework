package by.itacademy.courses.hw13.Task1;

public class MyThread1 extends Thread {


    public void thread() {
        System.out.println(Thread.currentThread().getState() + " состояние runnable");
        try {
            MyThread thread = new MyThread();
            thread.start();
            thread.join();
            System.out.println("WAITING");


            MyThread.sleep(2000);
            System.out.println("TIMED_WAITING");

            throw new InterruptedException();
        } catch (InterruptedException e) {
            System.out.println("BLOCKER");
        }
    }
}

