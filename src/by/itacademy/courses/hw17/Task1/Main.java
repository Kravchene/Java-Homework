package by.itacademy.courses.hw17.Task1;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> aClass = Class.forName("java.util.HashMap");
        ReflectionLogic.getClassField(aClass.getDeclaredFields());
        System.out.println("Родительский класс: " + ReflectionLogic.getParentClass(aClass.getSuperclass()));
        ReflectionLogic.getConstructorClass(aClass.getConstructors());
        ReflectionLogic.getMethodClass(aClass.getDeclaredMethods());
        ReflectionLogic.getInnerClass(aClass.getDeclaredClasses());
    }
}


