package by.itacademy.courses.hw13.Task1;

public class MyThread1 extends Thread implements ThreadMethod {

    @Override
    public void thread() {
        try {
            MyThread thread = new MyThread();
            thread.start();

            MyThread.sleep(2000);
            thread.stop();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
            //BLOCKER
        }
    }
}

