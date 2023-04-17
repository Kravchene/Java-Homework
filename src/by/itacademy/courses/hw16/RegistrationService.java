package by.itacademy.courses.hw16;

import java.time.LocalDateTime;

public class RegistrationService {
    static UserRepository userRepository = new UserRepository();

    public static void repository(String a, String b, LocalDateTime registrationDate, LocalDateTime date) {
        UserAccount userAccount = new UserAccount(a, b,registrationDate,date);
        userRepository.getListOfUsers().add(userAccount);
    }
}
