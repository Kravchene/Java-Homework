package by.itacademy.courses.hw14.Task1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ShowTime extends Thread implements ScannerDateTime {
    public void run() {
        int timeSleep = scannerDateTime();
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

    @Override
    public int scannerDateTime() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
