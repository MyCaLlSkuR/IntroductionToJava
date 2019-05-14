import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter range: ");
        int startRange = enter.nextInt();
        int endRange = enter.nextInt();
        for (int i = startRange; i <= endRange; i++){
            for (int j = i+1; j <= endRange; j++){
                if (isFriendly(i, j)){
                    System.out.println(i + " " + j);
                }
            }
        }
    }
    private static boolean isFriendly (int A, int B){
        int sumA = 0;
        int sumB = 0;
        for (int i = 1; i <= A / 2; i++) {
            if (A % i == 0) {
                sumA += i;
            }
        }
        for (int i = 1; i <= B / 2; i++) {
            if (B % i == 0) {
                sumB += i;
            }
        }
        if (sumA == B && sumB == A){
            return true;
        }
        else {
            return false;
        }
    }
}
