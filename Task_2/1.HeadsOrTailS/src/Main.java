import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int N = 1000; // Numbers of flip
        int head = 0;
        int tail = 0;
        Random rand = new Random();
        while (N > 0){
            if (rand.nextBoolean()){
                head++;
            }
            else {
                tail++;
            }
            N--;
        }
        System.out.println("Heads: " + head + " Tails: " + tail);
    }
}
