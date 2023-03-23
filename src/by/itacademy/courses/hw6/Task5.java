package by.itacademy.courses.hw6;

public class Task5 {
    public static void main(String[] args) throws Exception {
        String inputString = "Object-oriented programming is a programming language model organized" + " around objects and data rather than logic." + " Object-oriented programming blabla." + " Object-oriented programming bla.object-oriented programming object-oriented programming object-oriented programming";
        System.out.println(changeTextInString(inputString, "object-oriented programming", "OOP"));
    }

    public static String changeTextInString(String inputString, String stringToReplace, String replacingString) {
        StringBuilder finalString = new StringBuilder(inputString);
        int i = 0;
        int counter = 0;
        while (i != -1) {
            if (counter % 2 == 1) {
                finalString.replace(i, i + stringToReplace.length(), replacingString);
                i += replacingString.length();
            } else {
                i += stringToReplace.length();
            }
            i = finalString.toString().toLowerCase().indexOf(stringToReplace, i);
            counter++;
        }
        return finalString.toString();
    }
}
