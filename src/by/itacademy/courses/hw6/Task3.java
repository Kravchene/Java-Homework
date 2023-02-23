package by.itacademy.courses.hw6;

public class Task3 {
    public static void main(String[] args) {
        String text = "Поменяйтттттт местами первое самое длинное слово с последним самым коротким";
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
        replacement(text,indexMax,indexMin,regex);
    }
        static void replacement (String text,int indexMax,int indexMin,String regex){
        String[]  words = text.split(regex);
        String string = words[indexMax];
        words[indexMax] = words[indexMin];
        words[indexMin] = string;
        for (String text2 : words){
            System.out.print(text2+" ");
        }
    }
}