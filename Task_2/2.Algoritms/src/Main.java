public class Main {

    public static void main(String[] args) {
        System.out.println(MaxNumber(918656412));
        System.out.println(isPalindrom(12321));
        System.out.println(isPrime(73));
        System.out.println(GCD(25, 35));
        System.out.println(LCM(6, 8));
        System.out.println(NumberOfDigits(1099001));
        PrimeDivisors(186);
    }


    // Метод возвращающий максимальную цифру числа

    private static int MaxNumber(int N) {
        int max = 0;
        while (N > 0) {
            if (N % 10 > max) {
                max = N % 10;
            }
            N /= 10;
        }
        return max;
    }


    // Метод проверяющий является ли число полиндромом

    private static boolean isPalindrom(Integer N) {
        String str = N.toString();
        boolean result = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                result = false;
                break;
            }
        }
        return result;
    }


    // Метод проверяющий является ли число простым

    private static boolean isPrime(int N) {
        boolean prime = true;
        for (int i = 2; i <= N / 2; i++) {
            if (N % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }


    // Метод возвращающий все простые делители числа (используя метод проверяющий является ли число простым: isPrime)

    private static void PrimeDivisors(int N) {
        System.out.print("Divisors " + N + ": ");
        for (int i = 1; i <= N / 2; i++) {
            if (N % i == 0 && isPrime(i)) {
                System.out.print(i + "  ");
            }
        }
    }


    //Метод определяющий НОК (используя метод определяющий НОД: GCD)

    private static int LCM(int a, int b){
        return a*b/GCD(a, b);
    }


    //Метод определяющий НОД (Алгоритм Евклида)

    private static int GCD(int a, int b) {
        if (b==0){
            return a;
        }
        else {
            return GCD(b, a % b);
        }
    }


    //Метод возвращающий количество различных цифр в числе

    private static int NumberOfDigits(Integer N){
        String strN = N.toString();
        String out = new String();
        for (int i = 0; i < strN.length(); i++) {
            if(!out.contains(String.valueOf(strN.charAt(i)))) {
                out += String.valueOf(strN.charAt(i));
            }
        }
        return out.length();
    }
}
