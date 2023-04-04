package by.itacademy.courses.hw9;

public class Pair<T, V> {
    T yin;
    V yan;

    Pair(T yin, V yan) {
        this.yan = yan;
        this.yin = yin;
    }

    public void swap() {
        V a = (V) getYin();
        setYin((T) getYan());
        setYan(a);

    }

    public V getYan() {
        return yan;
    }

    public void setYan(V yan) {
        this.yan = yan;
    }

    public T getYin() {
        return yin;
    }

    public void setYin(T yin) {
        this.yin = yin;
    }

    @Override
    public String toString() {
        return "yin=" + yin +
                ", yan=" + yan;
    }
}
