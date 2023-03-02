package by.itacademy.courses.hw8;

public class Shoes extends Clothes {
    Shoes( int size) {
        super(size);
    }

    Shoes( int size, String colour) {
        super(size, colour);
    }
    Shoes(String model, int size, String colour) {
        super(model, size, colour);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public int hashCode1() {
        return super.hashCode1();
    }

    @Override
    public int hashCode2() {
        return super.hashCode2();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public boolean equals1(Object o) {
        return super.equals1(o);
    }

    @Override
    public boolean equals2(Object o) {
        return super.equals2(o);
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
