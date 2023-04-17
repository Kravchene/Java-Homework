package by.itacademy.courses.hw14.Task1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ShowTime extends Thread  {
    public void run() {
        int timeSleep = scannerDateTime()*1000;
        while (true) {
            LocalDateTime localDateTime = LocalDateTime.now();
            try {
                Thread.sleep(timeSleep);
                System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public int scannerDateTime() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
