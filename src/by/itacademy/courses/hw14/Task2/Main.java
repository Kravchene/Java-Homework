package by.itacademy.courses.hw14.Task2;

public class Main {
    public static void main(String[] args) throws Exception {
        Philosopher[] philosophers = new Philosopher[5];
        Object[] forks = new Object[5];

        for (int i = 0; i < forks.length; i++) {
            forks[i] = new Object();
        }

        for (int i = 0; i < philosophers.length; i++) {
            Object leftFork = forks[i];
            Object rightFork = forks[(i + 1) % forks.length];

            if (i == philosophers.length - 1) {
                philosophers[i] = new Philosopher(rightFork, leftFork);
            } else {
                philosophers[i] = new Philosopher(leftFork, rightFork);
            }
            Thread thread = new Thread(philosophers[i], "Философ " + (i + 1));
            thread.start();
        }
    }
}