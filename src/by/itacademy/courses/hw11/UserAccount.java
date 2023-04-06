package by.itacademy.courses.hw11;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UserAccount implements Cloneable {
    String login;
    String password;

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

    public static void repository(String a,String b) {
        UserAccount userAccount=new UserAccount(a,b);
        UserRepository.getUser().add(userAccount);
    }

    public static boolean loginVerification(UserAccount a) {
        boolean trueOrFalse = false;
        for (UserAccount search : UserRepository.getUser()) {
            if (a.getLogin().contains(search.login)) {
                trueOrFalse = true;
            }
        }
        return trueOrFalse;
    }

    public static boolean passwordVerification(UserAccount a) {
        boolean trueOrFalse = false;
        for (UserAccount search : UserRepository.getUser()) {
            if (a.equals(search)) {
                trueOrFalse = true;
            }
        }
        return trueOrFalse;
    }
}
