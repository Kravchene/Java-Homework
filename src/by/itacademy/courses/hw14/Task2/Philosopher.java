package by.itacademy.courses.hw14.Task2;

public class Philosopher implements Runnable {
    private final Object leftFork;

    private final Object rightFork;

    public Philosopher(Object leftFork, Object rightFork) {
        this.leftFork = leftFork;
        this.rightFork = rightFork;
    }

    private void table(String text) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " " + text);
        Thread.sleep(1000);
    }

    String eating() {
        return "ест";
    }

    String thinking() {
        return "размышляет";
    }

    String forkRight() {
        return "берёт правую вилку";
    }

    String forkLeft() {
        return "берёт левкую вилку";
    }

    @Override
    public void run() {
        try {
            while (true) {
                table(thinking());
                synchronized (leftFork) {
                    table(forkLeft());
                    synchronized (rightFork) {
                        table(forkLeft());
                        table(forkRight());
                        table(eating());
                    }
                    table("Отложите левую вилку");
                    Thread.currentThread().interrupt();
                    System.out.println(Thread.currentThread().getName() + " выхлдит из за стола");
                }
            }
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        }
    }
}
