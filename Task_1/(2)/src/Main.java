import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.print("Enter Dinosaur weight in kilogram: ");
        double N = enter.nextDouble();
        System.out.println("Dinosaur wright in ton: " + N/1000);
        System.out.println("Dinosaur wright in gram: " + N*1000);
        System.out.println("Dinosaur wright in milligram: " + N*1000000);
    }
}
