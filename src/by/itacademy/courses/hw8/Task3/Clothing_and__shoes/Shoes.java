package by.itacademy.courses.hw8.Task3.Clothing_and__shoes;

public class Shoes extends Clothes {
    public Shoes(int size) {
        super(size);
    }

    public Shoes(int size, String colour) {
        super(size, colour);
    }

    public Shoes(String model, int size, String colour) {
        super(model, size, colour);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
