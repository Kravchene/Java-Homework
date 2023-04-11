package by.itacademy.courses.hw11.exception;

public class WrongPasswordException extends Exception implements PrintException {
    public WrongPasswordException() {
    }

    @Override
    public void printException() {
        System.out.println("неправильный пароль");
        System.out.println("WrongPasswordException");
        System.out.println("Попробуйте снова");
        System.out.println("Пароль должен содержать только латинские буквы, цифры и знак подчеркивания. Длина от 8 символов.");
    }
}