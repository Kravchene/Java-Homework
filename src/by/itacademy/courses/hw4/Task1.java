package by.itacademy.courses.hw4;

public class Task1 {
    public static void main(String[] args){
        table();
        }
        static void table(){
            for (int i = 1; i <= 10; i++) {
                for (int j = 1; j <= 10; j++) {
                    System.out.print(i +"*"+j+"="+(i * j)+ "\t");}
                System.out.println();
            }
        }

}
