package by.itacademy.courses.hw8;

public class Main {
    public static void main(String[] args) {
        User user = new User("Den", "151!asda484");
        User.Query query = new User.Query();
        query.printToLog();
        System.out.println();
        Food food = new Food("a");
        Cookable cookable = new Cookable() {
            @Override
            public void cook(String str) {
                System.out.println("cook");
            }
        };
        food.prepare(cookable, food.str);
            }
        }


    