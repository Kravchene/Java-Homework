package by.itacademy.courses.hw6;

public class Task3 {
    public static void main(String[] args) {
        String text = "Поменяйтттттт местами первое самое длинное слово с последним самым коротким.";
        String regex = ("\\s+");

        String[] words = text.split(regex);
        int arrayLength = words.length;
        int lengthMax = 0;
        int lengthMin = words[0].length();
        int indexMax = 0;
        int indexMin = 0;
        for (int i = 0; i < arrayLength; i++) {
            if (lengthMax < words[i].length()) {
                lengthMax = words[i].length();
                indexMax = i;
            }
            for (int a = 0; a < arrayLength; a++) {
                if (lengthMin >= words[a].length()) {
                    lengthMin = words[a].length();
                    indexMin = a;
                }
            }
        }
        String[] words1 = replacement(text, indexMax, indexMin, regex);
        print(words1);
    }

    static String[] replacement(String text, int indexMax, int indexMin, String regex) {
        String[] words = text.split(regex);
        String string = words[indexMax];
        words[indexMax] = words[indexMin];
        words[indexMin] = string;
        return words;
    }

    static void print(String[] a) {
        for (String text2 : a) {
            System.out.print(text2 + " ");
        }
    }
}