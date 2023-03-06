package by.itacademy.courses.hw9;

public class Calculator< T, V, S> {
    T a;
    V b;
    S s;

    Calculator(T a, V b, S s) {
        this.a = a;
        this.b = b;
        this.s = s;
    }

    private static  <T , V > double sumDouble(T a, V b) {
        double c;
        return c = (double) a + (double) b;
    }

    private static  <T , V > double multiplyDouble(T a, V b) {
        double c;
        return c = (double) a * (double) b;
    }

    private static <T , V > double divideDouble(T a, V b) {
        double c;
        return c = (double) a / (double) b;
    }

    private static <T , V > double subtractionDouble(T a, V b) {
        double c;
        return c = (double) a - (double) b;
    }

    public void sad() {
        switch ((String) s) {
            case "+":
                System.out.println(sumDouble(a,b));
                break;
            case "*":
                System.out.println(multiplyDouble(a, b));
                break;
            case "/":
                System.out.println(divideDouble(a, b));
                break;
            case "-":
                System.out.println(subtractionDouble(a, b));
                break;
            default:
                System.out.println("error");
        }
    }
}