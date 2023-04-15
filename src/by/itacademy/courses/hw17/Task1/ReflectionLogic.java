package by.itacademy.courses.hw17.Task1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionLogic {
    public static void getClassField(Field[] getClass) {
        Arrays.stream(getClass).forEach(System.out::println);
    }
    public static String getParentClass(Class<?> getClass) {
        return getClass.getName();
    }
    public static void getConstructorClass(Constructor<?>[] getClass){
        Arrays.stream(getClass).forEach(System.out::println);

    }

    public static void getMethodClass(Method[] getClass) {
        Arrays.stream(getClass).forEach(System.out::println);
    }
    public static void getInnerClass(Class<?>[] getClass){
        Arrays.stream(getClass).forEach(System.out::println);
    }
}
