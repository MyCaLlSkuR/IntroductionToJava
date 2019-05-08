import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter R1: ");
        int R1 = enter.nextInt();
        System.out.println("Enter R2: ");
        int R2 = enter.nextInt();
        if (R1>R2){
            System.out.println("Ring area: " + 3.14159265*(R1*R1 - R2*R2));
        }
    }
}
