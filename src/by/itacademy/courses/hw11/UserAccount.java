package by.itacademy.courses.hw11;


import java.util.Objects;

public class UserAccount implements Cloneable {
    String login;
    String password;

    public UserAccount() {
    }

    public UserAccount(String login, String password) {
        this.login = login;
        this.password = password;
    }
    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserAccount that = (UserAccount) o;
        return Objects.equals(password, that.password);
    }


}
