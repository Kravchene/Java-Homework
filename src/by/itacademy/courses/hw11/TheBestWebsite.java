package by.itacademy.courses.hw11;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TheBestWebsite {
    public static void main(String[] args) throws WrongLoginException {
        System.out.println("*** Добро пожаловать на самый лучший сайт ***");
        boolean exit=false;
        while (exit==false){
        System.out.println();
        System.out.println("*** Для регистрации нажмите : 1 ***");
        System.out.println("*** Для авторизации нажмите: 2 ***");
        System.out.println("*** Для выхода нажмите : 3  ***");
        System.out.print("*** поле для ввода :" );
            try {
        Scanner in =new Scanner(System.in);
        int choice = in.nextInt();
        switch (choice){
            case 1:
                System.out.println();
                System.out.println("*** Добро пожаловать в раздел регистрация ***");
                System.out.println("*** Для регистрации вам нужно создать логин и пароль ***");
                System.out.println("*** Логин должен содержать только латинские буквы, цифры и знак подчеркивания. Длина должна быть от 5 до 20 символов ***");
                boolean check=false;
                String login1 =null;
                while (check ==false) {
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
                        System.out.println("WrongLoginException");
                        System.out.println("Попробуйте снова");
                        System.out.println("*** Логин должен содержать только латинские буквы, цифры и знак подчеркивания. Длина должна быть от 5 до 20 символов ***");
                    }
                }
                System.out.println();
                System.out.println("Осталось создать пароль");
                System.out.println("Пароль должен содержать только латинские буквы, цифры и знак подчеркивания. Длина от 8 символов.");
                boolean check2=false;
                String password1=null;
                while (check2 ==false) {
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
                    }catch (WrongPasswordException a){
                        System.out.println("WrongPasswordException");
                        System.out.println("Попробуйте снова");
                        System.out.println("Пароль должен содержать только латинские буквы, цифры и знак подчеркивания. Длина от 8 символов.");

                    }
                }
                UserRepository userRepository = new UserRepository(login1,password1);
                UserRepository.repository(userRepository);
                System.out.println("Пользователь успешно зарегистрирован");
                break;
            case 2:
                System.out.println();
                System.out.println("*** добро пожаловать в раздел авторизация ***");
                System.out.println("*** Для авторизации введите логин и пароль ***");
                boolean  check1=false;
                String login2 =null;
                while (check1==false) {
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
                boolean check3=false;
                String password2=null;
                while (check3==false) {
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
                UserRepository userRepository1=new UserRepository(login2,password2);
                boolean loginVerification=UserRepository.loginVerification(userRepository1);

                try {
                    if (loginVerification) {
                    } else {
                        throw new UserNotExistException();
                    }
                }catch (UserNotExistException a){
                    System.out.println("UserNotExistException");
                    System.out.println("Пользователь с таким логином не найден найден");
                }

                boolean passwordVerification =UserRepository.passwordVerification(userRepository1);
                try {
                    if (passwordVerification) {
                    } else {
                        throw new WrongPasswordException();
                    }
                }catch (WrongPasswordException a){
                    System.out.println("WrongPasswordException");
                    System.out.println("Неверный пароль");
                }
                if (loginVerification&&passwordVerification){
                    System.out.println("Пользователь найден можете зайти на главную страницу сайта");
                    System.out.println("*** Главная страница сайта ***");
                    exit=true;
                }

                break;
            case 3:
                System.out.println();
                System.out.println("Вы решили выйти с сайта!");
                System.out.println("***выход***");
                exit=true;
                break;
            default:
                System.out.println("Ошибка попробуй снова ввести значение от 1 до 3");
                break;
        }
    }catch (InputMismatchException a){
                System.out.println("Ошибка вы ввели неверное значение");
                System.out.println("Надо ввести значение от 1 до 3");
                System.out.println("********************************");
            }
        }
    }
}
