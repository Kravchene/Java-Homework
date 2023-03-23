package by.itacademy.courses.hw6;

public class Task1 {
    public static void main(String[] args) {
        String text = " Вводится  ненормированная  строка ";
        adjustment(text);
    }
    static void adjustment(String text){
        String regex ="\\s+";
        System.out.print(text.replaceAll(regex,"\s").trim());
    }
}
