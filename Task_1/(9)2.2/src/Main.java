
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int N = enter.nextInt();
        int heads = 3;
        if (N<=200){
            heads += 3*N;
            System.out.println(heads + " - heads!");
        }
        else if(N<=300){
            heads += 600 + (N-200)*2;
            System.out.println(heads + " - heads!");
        }
        else {
            heads += 500 + N;
            System.out.println(heads + " - heads!");
        }
    }
}
