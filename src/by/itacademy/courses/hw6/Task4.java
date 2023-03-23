package by.itacademy.courses.hw6;

public class Task4 {
    public static void main(String[] args) {
        int a = 3;
        int b = 56;
        StringBuilder str = new StringBuilder();
        System.out.println(str.append(a).append("+").append(b).append("=").append(a + b).append("\n").
                append(a).append("-").append(b).append("=").append(a - b).append("\n").
                append(a).append("*").append(b).append("=").append(a * b));
        System.out.println(str.toString().replaceAll("=", " равно "));
    }
}
