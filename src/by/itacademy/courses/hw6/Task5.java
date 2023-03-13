package by.itacademy.courses.hw6;

public class Task5 {
    public static void main(String[] args) {
        String text = "Object-oriented programming is a programming language model organized around" +
                " objects rather than \"actions\" and data rather than logic. Object-oriented" +
                " programming blabla. Object-oriented programming bla.";
        String replacedText1 = "Object-oriented programming";
        String replacedText2 = "OOP";
        editor(text,replacedText1,replacedText2);
    }

    static void editor(String text,String replacedText1,String replacedText2) {
        int index = 0,number = 1;
        while (true) {
            index = text.indexOf(replacedText1, index);
            if (index != -1) {
                if (number % 2 == 0) {
                    text = text.substring(0, index) + replacedText2 + text.substring(index + replacedText1.length());
                }
                number++;
                index += replacedText1.length();
            } else {
                break;
            }
        }
        System.out.println(text);
    }
}