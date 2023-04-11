package by.itacademy.courses.hw11;

public class RegistrationService {
    static UserRepository userRepository = new UserRepository();

    public static void repository(String a, String b) {
        UserAccount userAccount = new UserAccount(a, b);
        userRepository.getListOfUsers().add(userAccount);
    }
}
