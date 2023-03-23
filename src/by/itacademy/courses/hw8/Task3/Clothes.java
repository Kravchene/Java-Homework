package by.itacademy.courses.hw8.Task3;

import java.util.Objects;

public class Clothes {
    String model;
    int size;
    String colour;

    Clothes(int size) {
        this.size = size;
    }

    Clothes(int size, String colour) {
        this.size = size;
        this.colour = colour;
    }

    Clothes(String model, int size, String colour) {
        this.model = model;
        this.size = size;
        this.colour = colour;
    }

    public boolean equals2(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clothes clothes = (Clothes) o;
        return size == clothes.size && colour.equals(clothes.colour);

    }

    public boolean equals1(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clothes clothes = (Clothes) o;
        return size == clothes.size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clothes clothes = (Clothes) o;
        return size == clothes.size && model.equals(clothes.model) && colour.equals(clothes.colour);
    }


    public int hashCode() {
        return Objects.hash(model, size, colour);
    }

    public int hashCode1() {
        return Objects.hash(size, colour);
    }

    public int hashCode2() {
        return Objects.hash(size);
    }

    @Override
    public String toString() {
        return "Модель = " + model + ", размер = " + size + ", цвет = " + colour;
    }
}

