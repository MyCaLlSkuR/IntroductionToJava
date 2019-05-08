import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int N = enter.nextInt();
        if (N > 999_999 && N < 10_000_000) {
            String number = new String();
            number = Integer.toString(N);
            String revNumber = new StringBuffer(number).reverse().toString();
            System.out.println(revNumber);
        }
        else {
            System.out.println("Not 7 digits!");
        }

    }
}
