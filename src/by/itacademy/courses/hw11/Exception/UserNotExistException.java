package by.itacademy.courses.hw11.Exception;

public class UserNotExistException extends Exception implements PrintException {
    public UserNotExistException() {
    }

    @Override
    public void printException() {
        System.out.println("UserNotExistException");
        System.out.println("Пользователь с таким логином не найден найден");
    }
}