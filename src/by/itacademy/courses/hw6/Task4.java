package by.itacademy.courses.hw6;

public class Task4 {
    public static void main(String[] args) {
        int a =3;
        int b = 56;
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        StringBuilder str3 = new StringBuilder();
        str1.append(a).append("+").append(b).append("=").append(a+b);
        str2.append(a).append("-").append(b).append("=").append(a-b);
        str3.append(a).append("*").append(b).append("=").append(a*b);
        System.out.println(str1+"\n"+str2+"\n"+str3);
        System.out.println(str1.toString().replaceAll("=", " равно ")+"\n"+
                str2.toString().replaceAll("=", " равно ")+"\n"+
                str3.toString().replaceAll("=", " равно ")+"\n");
    }
}
