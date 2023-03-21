package by.itacademy.courses.hw11;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UserRepository implements Cloneable {
    String login;
    String password;

    UserRepository(String login, String password) {
        this.login = login;
        this.password = password;

    }
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserRepository that = (UserRepository) o;
        return Objects.equals(login, that.login);

    }
    public boolean equals1(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserRepository that = (UserRepository) o;
        return Objects.equals(password, that.password);
    }

    public static List<UserRepository> user = new ArrayList<>();

    public static void repository(UserRepository a) {
        user.add(a);
    }

    public static boolean loginVerification(UserRepository a) {
        boolean trueOrFalse=false;
        for (UserRepository search : user) {
            if (a.equals(search)) {
                trueOrFalse=true;
            }
        }
        return trueOrFalse;
    }
        public static boolean passwordVerification (UserRepository a){
            boolean trueOrFalse=false;
            for (UserRepository search : user) {
                if (a.equals1(search)) {
                    trueOrFalse=true;
                }
            }
            return trueOrFalse;
        }
    }
