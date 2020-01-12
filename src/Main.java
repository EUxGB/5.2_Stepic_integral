import java.util.function.DoubleUnaryOperator;

public class Main {

    public static double integrate(DoubleUnaryOperator f, double a, double b) {
        int i, n;
        double result = 0;
        double shag = 10E-6;
        n = (int) ((b - a) / shag);
        for (i = 0; i < n; i++) {
            result += shag * f.applyAsDouble(a + shag * i);

        }
        return result;
    }

    public static void main(String[] args) {
        Main op = new Main();
        System.out.println(integrate(x -> x, 0, 1));

    }

}
