package by.itacademy.courses.hw11;

public class Verification {
    static UserRepository userRepository = new UserRepository();

    private Verification(){
    }
    public static boolean loginVerification(UserAccount a) {
        boolean trueOrFalse = false;
        for (UserAccount search : userRepository.getListOfUsers()) {
            if (a.getLogin().contains(search.login)) {
                trueOrFalse = true;
            }
        }
        return trueOrFalse;
    }

    public static boolean passwordVerification(UserAccount a) {
        boolean trueOrFalse = false;
        for (UserAccount search : userRepository.getListOfUsers()) {
            if (a.equals(search)) {
                trueOrFalse = true;
            }
        }
        return trueOrFalse;
    }
}
