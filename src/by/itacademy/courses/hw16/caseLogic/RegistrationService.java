package by.itacademy.courses.hw16.caseLogic;

import by.itacademy.courses.hw16.Printer;
import by.itacademy.courses.hw16.UserAccount;
import by.itacademy.courses.hw16.UserRepository;
import by.itacademy.courses.hw16.exception.WrongLoginException;
import by.itacademy.courses.hw16.exception.WrongPasswordException;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistrationService {
    final String regexLogin = "^\\S[a-zA-Z-_]{5,20}\\S$";
    final String regexPassword = "^\\S[a-zA-Z\\d-_]{8,}\\S$";

    void creatingLoginAndPassword() {
        boolean check = false;
        String login1 = null;
        while (check == false) {
            try {
                Scanner scannerLogin = new Scanner(System.in);
                System.out.print("Введите Логин: ");
                String login = scannerLogin.nextLine();
                Pattern pattern = Pattern.compile(regexLogin);
                Matcher matcher = pattern.matcher(login);
                if (matcher.find()) {
                    check = true;
                    System.out.println("Поздравляю логин создан успешно");
                    login1 = login;
                } else {
                    throw new WrongLoginException();
                }
            } catch (WrongLoginException a) {
                a.printException();
            }
        }
        Printer.creatingPassword();
        boolean check2 = false;
        String password1 = null;
        while (check2 == false) {
            try {
                Scanner scannerPassword = new Scanner(System.in);
                System.out.print("Введите пароль: ");
                String password = scannerPassword.next();
                Pattern pattern = Pattern.compile(regexPassword);
                Matcher matcher = pattern.matcher(password);
                if (matcher.find()) {
                    check2 = true;
                    System.out.println("Поздравляю пароль создан успешно");
                    password1 = password;
                } else {
                    throw new WrongPasswordException();
                }
            } catch (WrongPasswordException a) {
                a.printException();
            }
        }
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println(localDateTime.format(LocalDateTimeLogic.format));
        by.itacademy.courses.hw16.RegistrationService.repository(login1, password1, localDateTime, localDateTime);
        UserRepository userRepository = new UserRepository();
        List<UserAccount> list = userRepository.getListOfUsers();
        System.out.println(list);
        System.out.println("Пользователь успешно зарегистрирован");
    }
}
