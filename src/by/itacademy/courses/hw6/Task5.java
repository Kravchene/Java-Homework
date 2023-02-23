package by.itacademy.courses.hw6;

public class Task5 {
    public static void main(String[] args) {
        String text = "Object-oriented programming is a programming language model organized around" +
                " objects rather than \"actions\" and data rather than logic. Object-oriented" +
                " programming blabla. Object-oriented programming bla.";
        String str1 = "Object-oriented programming";
        String str2 = "OOP";

        editor(text,str1,str2);
    }

    static void editor(String text,String str1,String str2) {
        int index = 0,number = 1;
        while (true) {
            index = text.indexOf(str1, index);
            if (index != -1) {
                if (number % 2 == 0) {
                    text = text.substring(0, index) + str2 + text.substring(index + str1.length());
                }
                number++;
                index += str1.length();
            } else {
                break;
            }
        }
        System.out.println(text);
    }
}