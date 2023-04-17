package by.itacademy.courses.hw8.Task2;

public class User {
    private String login;
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }


    User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    class Query {
        public void printToLog() {
            System.out.println("Пользователь с логином: " + getLogin() + "\nИ паролем: " + getPassword() + "\nОтправил запрос");
        }
    }
}
