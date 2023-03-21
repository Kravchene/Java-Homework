package by.itacademy.courses.hw7.Task4;

import java.util.Arrays;

public class Bouquet {
    Flowers[] flowers=new Flowers[]{new Flowers("Likoris",5.5,"Red",7),
            new Flowers("Rose",4.5,"Red",8),
            new Flowers("Lily",3.1,"white",5)};

    void price() {
        double sum = flowers[0].price + flowers[1].price + flowers[2].price;
        System.out.println("Cтоимость букета: " + sum + "BYN");
    }
    void colour() {
        String color = flowers[0].colour + ", " + flowers[1].colour + ", " + flowers[2].colour;
        System.out.println("Букет состоит из следующих цветов: " + color);
    }
    void lifetime(){
        int[] lifetime = new int[]{flowers[0].lifetime, flowers[1].lifetime, flowers[2].lifetime};
        Arrays.sort(lifetime);
        int number=lifetime.length-1;
        System.out.println("Букет будет жить: "+lifetime[number]+" дней");
    }
}
