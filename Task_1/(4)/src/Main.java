import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int N = enter.nextInt();
        if (N > 999 && N < 10000){
            int a = N % 10;
            N /= 10;
            int b = N % 10;
            N /= 10;
            int c = N % 10;
            N /= 10;
            int d = N % 10;
            N /= 10;
            if (a>b && b>c && c>d){
                System.out.println("Increasing sequence!");
            }
            else if (a<b && b<c && c<d){
                System.out.println("Decreasing sequence!");
            }
            else if (a==b && b==c && c==d){
                System.out.println("Equal digits!");
            }
            else {
                System.out.println("Not sequence!");
            }
        }
        else {
            System.out.println("Not 4 digits!");
        }
    }
}
