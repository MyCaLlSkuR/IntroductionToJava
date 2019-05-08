import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter coordinate x1 y1: ");
        int x1 = enter.nextInt();
        int y1 = enter.nextInt();
        System.out.println("x2 y2: ");
        int x2 = enter.nextInt();
        int y2 = enter.nextInt();
        System.out.println("x3 y3: ");
        int x3 = enter.nextInt();
        int y3 = enter.nextInt();
        if (x3 * (y2 - y1) - y3 * (x2 - x1) == x1 * y2 - x2 * y1){
            System.out.println("Not triangle!");
        }
        else if(((x2-x1)*(x3-x1)+(y2-y1)*(y3-y1))== 0) {
            System.out.println("Right triangle!");
        }
        else {
            System.out.println("Not a right triangle!");
        }

    }
}
