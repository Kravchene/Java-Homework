package by.itacademy.courses.hw4;

public class Task8 {
        public static void main(String[] args) {
            System.out.println("Счастливых билетов в одном рулоне: "+luckyTicket());
        }

        static int luckyTicket (){
            int happy = 0;
            for (int i = 1001; i < 1000000; i++) {
                int a=i/100000%10, b=i/10000%10, c=i/1000%10, d=i/100%10, e=i/10%10, f=i%10;
                int sum1=a + b + c, sum2 =d + e + f;
                if (sum1 == sum2) happy++;
            }
            return happy;
        }
    }