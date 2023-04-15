package by.itacademy.courses.hw17.Task2;

public class CheckLogic {

    public static void check(Methods a, String b) throws NoSuchMethodException {
        if (a.getClass().getMethod(b).isAnnotationPresent(AcademyInfo.class)) {
            AcademyInfo annotation = a.getClass().getMethod(b).getAnnotation(AcademyInfo.class);
            System.out.printf("Метод %s имеет аннотации @AcademyInfo year = %s", b, annotation.year());
            System.out.println();
        } else {
            System.out.printf("Метод %s не имеет аннотации @AcademyInfo", b);
            System.out.println();
        }
    }
}
