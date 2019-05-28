import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner enter = new Scanner(System.in);
        System.out.println("Enter your array size:");
        System.out.print("N: ");
        int N = enter.nextInt();
        System.out.print("M: ");
        int M = enter.nextInt();
        System.out.print("Min number: ");
        double min = enter.nextDouble();
        System.out.print("Max number: ");
        double max = enter.nextDouble();

        Array array = new Array();
        array.init(N, M, min, max);

        System.out.println("Max element: " + array.getMax());
        System.out.println("Min element: " + array.getMin());
        System.out.println("Arithmetic Mean: " + array.getArithmeticMean());
        System.out.println("Geometric Mean: " + array.getGeometricMean());
        System.out.println("Local min index: " + array.getLocalMin());
        System.out.println("Local max index: " + array.getLocalMax());

        System.out.println("Transposed array: ");
        array.Transpose();


    }
}

