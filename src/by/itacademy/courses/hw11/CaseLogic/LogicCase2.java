package by.itacademy.courses.hw11.CaseLogic;

import by.itacademy.courses.hw11.Exception.UserNotExistException;
import by.itacademy.courses.hw11.Exception.WrongPasswordException;
import by.itacademy.courses.hw11.Printer;
import by.itacademy.courses.hw11.UserAccount;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogicCase2 {
    static boolean check() {
        boolean exit = false;
        boolean check1 = false;
        String login2 = null;
        while (check1 == false) {
            Scanner scannerLogin = new Scanner(System.in);
            System.out.print("Введите Логин: ");
            String login = scannerLogin.nextLine();
            String regex = "^\\S[a-zA-Z\\d-_]{5,20}\\S$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(login);
            if (matcher.find()) {
                check1 = true;
                login2 = login;

            }
        }
        boolean check3 = false;
        String password2 = null;
        while (check3 == false) {
            Scanner scannerPassword = new Scanner(System.in);
            System.out.print("Введите пароль: ");
            String password = scannerPassword.next();
            String regex = "^\\S[a-zA-Z\\d-_]{8,}\\S$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(password);
            if (matcher.find()) {
                check3 = true;
                password2 = password;
            }
        }
        UserAccount userRepository1 = new UserAccount(login2, password2);
        boolean loginVerification = UserAccount.loginVerification(userRepository1);

        try {
            if (loginVerification==true) {
            } else {
                throw new UserNotExistException();
            }
        } catch (UserNotExistException a) {
            a.printException();
        }

        boolean passwordVerification = UserAccount.passwordVerification(userRepository1);
        try {
            if (passwordVerification) {
            } else {
                throw new WrongPasswordException();
            }
        } catch (WrongPasswordException a) {
            a.printException();
        }
        if (loginVerification && passwordVerification) {
            Printer.loginToTheMainPage();
            exit = true;
        }
        return exit;
    }

}
