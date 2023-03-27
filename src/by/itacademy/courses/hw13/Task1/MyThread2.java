package by.itacademy.courses.hw13.Task1;

public class MyThread2 extends Thread implements ThreadMethod {
    @Override
    public void thread() {
        try {
            MyThread thread = new MyThread();
            System.out.println("NEW");
            thread.start();
            System.out.println("RUNNABLE");

            MyThread.sleep(1000);
            thread.stop();
            System.out.println("TERMINATED");
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
