package by.itacademy.courses.hw16;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    private static List<UserAccount> listOfUsers = new ArrayList<>();

    public List<UserAccount> getListOfUsers() {
        return listOfUsers;
    }
}
