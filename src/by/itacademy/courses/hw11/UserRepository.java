package by.itacademy.courses.hw11;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class UserRepository {
    private static List<UserAccount> user = new ArrayList<>();

    public static List<UserAccount> getUser() {
        return user;
    }
}
