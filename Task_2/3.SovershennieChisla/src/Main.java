import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int N = enter.nextInt();
        int sum = 0;
        for (int i = 1; i <= N / 2; i++) {
            if (N % i == 0) {
                sum += i;
            }
        }
        if (sum == N){
            System.out.println("Sovershennoe");
        }
        else {
            System.out.println("Ne sovershennoe");
        }
    }
}
