package by.itacademy.courses.hw16.exception;

public class WrongLoginException extends Exception implements PrintException {
    public WrongLoginException() {
    }

    @Override
    public void printException() {
        System.out.println("неправильный логин");
        System.out.println("WrongLoginException");
        System.out.println("Попробуйте снова");
        System.out.println("*** Логин должен содержать только латинские буквы, цифры и знак подчеркивания. Длина должна быть от 5 до 20 символов ***");
    }
}
