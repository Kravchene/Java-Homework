package by.itacademy.courses.hw11.CaseLogic;

import by.itacademy.courses.hw11.Exception.WrongLoginException;
import by.itacademy.courses.hw11.Exception.WrongPasswordException;
import by.itacademy.courses.hw11.Printer;
import by.itacademy.courses.hw11.UserAccount;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogicCase1 {
    static void creatingLoginAndPassword() {
        boolean check = false;
        String login1 = null;
        while (check == false) {
            try {
                Scanner scannerLogin = new Scanner(System.in);
                System.out.print("Введите Логин: ");
                String login = scannerLogin.nextLine();
                String regex = "^\\S[a-zA-Z-_]{5,20}\\S$";
                Pattern pattern = Pattern.compile(regex);
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
                String regex = "^\\S[a-zA-Z\\d-_]{8,}\\S$";
                Pattern pattern = Pattern.compile(regex);
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
        UserAccount.repository(login1,password1);
        System.out.println("Пользователь успешно зарегистрирован");
    }
}
