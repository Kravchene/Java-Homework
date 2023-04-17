package by.itacademy.courses.hw16.caseLogic;

import by.itacademy.courses.hw16.Printer;
import by.itacademy.courses.hw16.UserAccount;
import by.itacademy.courses.hw16.Verification;
import by.itacademy.courses.hw16.exception.UserNotExistException;
import by.itacademy.courses.hw16.exception.WrongPasswordException;

import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AuthorizationService {

    final String regexLogin = "^\\S[a-zA-Z\\d-_]{5,20}\\S$";
    final String regexPassword = "^\\S[a-zA-Z\\d-_]{8,}\\S$";

    boolean check() {
        boolean exit = false;
        boolean check1 = false;
        String login2 = null;
        while (!check1) {
            Scanner scannerLogin = new Scanner(System.in);
            System.out.print("Введите Логин: ");
            String login = scannerLogin.nextLine();
            Pattern pattern = Pattern.compile(regexLogin);
            Matcher matcher = pattern.matcher(login);
            if (matcher.find()) {
                check1 = true;
                login2 = login;

            }
        }
        boolean check3 = false;
        String password2 = null;
        while (!check3) {
            Scanner scannerPassword = new Scanner(System.in);
            System.out.print("Введите пароль: ");
            String password = scannerPassword.next();
            Pattern pattern = Pattern.compile(regexPassword);
            Matcher matcher = pattern.matcher(password);
            if (matcher.find()) {
                check3 = true;
                password2 = password;
            }
        }
        UserAccount userRepository1 = new UserAccount(login2, password2);
        boolean loginVerification = Verification.loginVerification(userRepository1);

        try {
            if (loginVerification) {
            } else {
                throw new UserNotExistException();
            }
        } catch (UserNotExistException a) {
            a.printException();
        }

        boolean passwordVerification = Verification.passwordVerification(userRepository1);
        try {
            if (passwordVerification) {
            } else {
                throw new WrongPasswordException();
            }
        } catch (WrongPasswordException a) {
            a.printException();
        }
        if (loginVerification && passwordVerification) {
            userRepository1.setLastAuthorizationDate(LocalDateTime.now());
            Printer.loginToTheMainPage();
            exit = true;
        }
        return exit;
    }

}
