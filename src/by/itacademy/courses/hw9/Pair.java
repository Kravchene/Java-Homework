package by.itacademy.courses.hw9;

public class Pair<T> {
    T yin;
    T yan;

    Pair(T yin,T yan){
        this.yan=yan;
        this.yin=yin;
    }

    public T getYan() {
        return yan;
    }

    public void setYan(T yan) {
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
        return "yin='" + yin + '\'' +
                ", yan='" + yan;
    }
}
