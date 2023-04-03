package by.itacademy.courses.hw8.Task3.Clothing_and__shoes;

import java.util.Objects;

public class Clothes {
    private String model;
    private int size;
    private String colour;

    public Clothes(int size) {
        this.size = size;
    }

    public Clothes(int size, String colour) {
        this.size = size;
        this.colour = colour;
    }

    public Clothes(String model, int size, String colour) {
        this.model = model;
        this.size = size;
        this.colour = colour;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clothes clothes = (Clothes) o;
        return size == clothes.size;
    }

    public int hashCode() {
        return Objects.hash(model, size, colour);
    }

    @Override
    public String toString() {
        return "Модель = " + model + ", размер = " + size + ", цвет = " + colour;
    }
}

