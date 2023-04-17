package by.itacademy.courses.hw13.Task1;

public class MyThread2 implements Runnable {
    public static Object getObject() {
        return object;
    }
    private static final Object object = new Object();
    public void run() {
        try {
            synchronized (object) {
                object.wait();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
