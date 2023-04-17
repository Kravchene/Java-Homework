package by.itacademy.courses.hw16.caseLogic;

import by.itacademy.courses.hw16.UserAccount;
import by.itacademy.courses.hw16.UserRepository;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LocalDateTimeLogic {
    static LocalDateTime dateStart;
    static LocalDateTime dateEnd;
    static UserRepository userRepository = new UserRepository();
    static DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    public static void searchForTheRegistrationInterval() {
        System.out.println("Введите нужный период времени");
        System.out.println("формат времени : yyyy-MM-dd HH:mm");
        System.out.print("Начало промежутка: ");
        Scanner in = new Scanner(System.in);
        dateStart = LocalDateTime.parse(in.nextLine(), format);
        System.out.print("Конец промежутка: ");
        dateEnd = LocalDateTime.parse(in.nextLine(), format);
        List<UserAccount> users = timeInterval(dateStart, dateEnd);
        System.out.println(users);
    }

    public static List<UserAccount> timeInterval(LocalDateTime dateStart, LocalDateTime dateEnd) {
        List<UserAccount> User = new ArrayList<>();
        List<UserAccount> users = userRepository.getListOfUsers();
        for (UserAccount user : users) {
            if (user.getRegistrationDate().isAfter(dateStart) && user.getRegistrationDate().isBefore(dateEnd)) {
                User.add(user);
            }
        }
        return User;
    }
}