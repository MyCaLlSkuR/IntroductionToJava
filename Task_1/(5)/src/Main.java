import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int N = enter.nextInt();
        double a = N % 10;
        N /= 10;
        double b = N % 10;
        N /= 10;
        double c = N % 10;
        N /= 10;
        double d = N % 10;
        N /= 10;
        double e = N % 10;
        N /= 10;
        double f = N % 10;
        System.out.println("Arithmetic mean: " + (a + b + c + d + e + f) / 6);
        System.out.println("Geometric mean: " + Math.pow((a * b * c * d * e * f), 1. / 6));
    }
}
