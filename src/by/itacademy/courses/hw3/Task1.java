package by.itacademy.courses.hw3;

public class Task1 {
    public static void main(String[] args) {
        int a = 125;
        Integer b = 95;
        unpacking(b);
        packaging(a);
    }

    static void packaging(Integer b){
        int B = b;
        System.out.println(B);
    }

    static void unpacking(int a){
        Integer A = a;
        System.out.println(A);
    }
}
