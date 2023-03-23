package by.itacademy.courses.hw8.Task2;

public class User {
    static String login;
    static String password;

    User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    static class Query {
        public void printToLog() {
            System.out.println("Пользователь с логином: " + login + "\nИ паролем: " + password + "\nОтправил запрос");
        }
    }
}
