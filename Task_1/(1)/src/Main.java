
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        int a = enter.nextInt();
        int b = enter.nextInt();
        int c = enter.nextInt();
        if (a==b && b==c){
            System.out.println("Все числа равны");
        }
        else if (a==b){
            System.out.println("a=b, c отлично");
        }
        else if (a==c){
            System.out.println("a=c, b отлично");
        }
        else if (b==c){
            System.out.println("b=c, a отлично");
        }
        else {
            System.out.println("Все числа различны");
        }

    }
}
