package by.itacademy.courses.hw13.Task1;

public class MyThread2 extends Thread {

    public void thread() {
        try {
            MyThread thread = new MyThread();
            System.out.println("NEW");
            thread.start();

            MyThread.sleep(1000);
            thread.stop();
            System.out.println("TERMINATED");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
