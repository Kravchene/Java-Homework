package by.itacademy.courses.hw7;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Алексей", "Птушкин", 8, "Математики", 3);
        Student student2 = new Student("Александр", "Круг", 25, "Физики", 5);

        GraduateStudent graduateStudent1 = new GraduateStudent("Павел", "Сыч", 12, "Физики", 4, "Физика полёта ракеты");
        GraduateStudent graduateStudent2 = new GraduateStudent("Никита", "Елисов", 25, "Физики", 5, "Оптические иллюзии");

        Student[] students = new Student[]{student1, student2};
        GraduateStudent[] graduateStudents = new GraduateStudent[]{graduateStudent1, graduateStudent2};

        for (Student studentX : students) {
            System.out.print(studentX.toString());
            System.out.println(" Cуммa стипендии: " + studentX.scholarship());
        }
        for (GraduateStudent graduateStudentX : graduateStudents) {
            System.out.print(graduateStudentX.toString());
            System.out.println(" Cуммa стипендии: " + graduateStudentX.scholarship());

        }
        System.out.println("\n");

        double celsius= 10.0;
        Kelvins kelvins=new Kelvins(celsius);
        System.out.println("Температура в кельвинах: "+kelvins.convert());
        Fahrenheit fahrenheit = new Fahrenheit(celsius);
        System.out.println("Температура в фаренгейтах: "+fahrenheit.convert());
        System.out.println("\n");

        Pears pears=new Pears(2.5,3.4);
        Apple apple=new Apple(1.5,2.0);
        Apricots apricots=new Apricots(3,4.5);
        double totalcost=pears.price(2.5)+apple.price(1.5)+ apricots.price(3);
        System.out.println("Общая стоимость фруктов в корзине: "+totalcost+"BYN\n"+"Общая цена яблок: "+apple.price(1.5)+"BYN\n"+
                "Общая цена груш: "+pears.price(2.5)+"BYN\n"+"Общая цена абрикосов: "+apricots.price(3)+"BYN");
        pears.printManufacturerInfo();
        System.out.println("\n");

        Rose rose=new Rose(4.5,"Red",8,"green","round");
        Lily lily=new Lily(3.1,"white",5,"green");
        LikorisLuchisty likorisLuchisty=new LikorisLuchisty(5.5,"Red",7,"green","round");
        double sum =rose.price+ lily.price+ likorisLuchisty.price;
        String color= rose.colour+", "+likorisLuchisty.colour+", "+lily.colour;
        int[] lifetime = new int[]{rose.lifetime, lily.lifetime, likorisLuchisty.lifetime};
        Arrays.sort(lifetime);
        int number=lifetime.length-1;
        System.out.println("Cтоимость букета: "+sum +"BYN");
        System.out.println("Букет состоит из следующих цветов: "+color);
        System.out.println("Букет будет жить: "+lifetime[number]+" дней");
    }

}