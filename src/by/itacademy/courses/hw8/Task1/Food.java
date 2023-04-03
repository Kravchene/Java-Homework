package by.itacademy.courses.hw8.Task1;

public class Food {
    private String str;

    Food(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void prepare(Cookable c, String str) {
        c.cook(str);
    }
}
