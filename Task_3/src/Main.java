import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter your array size:");
        System.out.print("N: ");
        int N = enter.nextInt();
        System.out.print("M: ");
        int M = enter.nextInt();
        int[][] array = new int[N][M];
        System.out.println("Enter your array: ");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                array[i][j] = enter.nextInt();
            }
        }

        System.out.println("Max element: " + FindMax(array));
        System.out.println("Min element: " + FindMin(array));
        System.out.println("Arithmetic Mean: " + FindArithmeticMean(array));
        System.out.println("Geometric Mean: " + FindGeometricMean(array));
        System.out.println("Local min index: " + FindLocalMin(array));
        System.out.println("Local max index: " + FindLocalMax(array));

        System.out.println("Transposed array: ");
        array = Transpose(array);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%3d", array[i][j]);
            }
            System.out.println();
        }
    }



    private static int FindMax(int array[][]) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    private static int FindMin(int array[][]) {
        int min = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (min > array[i][j]) {
                    min = array[i][j];
                }
            }
        }
        return min;
    }

    private static double FindArithmeticMean(int array[][]) {
        double sum = 0;
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
                temp++;
            }
        }
        return sum / temp;
    }

    private static double FindGeometricMean(int array[][]) {
        double comp = 1;
        double temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                comp *= array[i][j];
                temp++;
            }
        }
        return Math.pow(comp, 1 / temp);
    }

    private static String FindLocalMin(int array[][]) {
        for (int i = 0; i < array.length; i++) {
            int temp = array[i].length - 1;
            for (int j = 1; j < temp; j++) {
                if (array[i][j] < array[i][j - 1] & array[i][j] < array[i][j + 1]) {
                    return "[" + i + "]" + "[" + j + "]";
                }
            }
        }
        return "" + -1;
    }

    private static String FindLocalMax(int array[][]) {
        for (int i = 0; i < array.length; i++) {
            int temp = array[i].length - 1;
            for (int j = 1; j < temp; j++) {
                if (array[i][j] > array[i][j - 1] & array[i][j] > array[i][j + 1]) {
                    return "[" + i + "]" + "[" + j + "]";
                }
            }
        }
        return "There is no local maximum, local minimum: " + FindLocalMin(array);
    }

    private static int[][] Transpose(int array[][]) {
        if (array.length == array[0].length) {
            for (int i = 0; i < array.length; i++) {
                int temp = i + 1;
                for (int j = temp; j < array[i].length; j++) {
                    int temp1 = array[i][j];
                    array[i][j] = array[j][i];
                    array[j][i] = temp1;
                }
            }
            return array;
        }
        else {
            int transArray[][] = new int[array[0].length][array.length];
            for (int i = 0; i < transArray.length; i++) {
                for (int j = 0; j < transArray[i].length; j++) {
                    transArray[i][j] = array[j][i];
                }
            }
            return transArray;
        }
    }
}

