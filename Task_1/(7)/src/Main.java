import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = enter.nextInt();
        System.out.println("Enter b: ");
        int b = enter.nextInt();
        a += b;
        b = a - b;
        a -= b;
        System.out.println("a: " + a + "; b: " + b);
    }
}
