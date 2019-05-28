import java.util.Arrays;
import java.util.Random;

public class Array {
    double array [][] ;

    public void init (int N, int M, double min , double max) {
        array = new double[N][M];
        Random rand = new Random();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                array[i][j] = (double) Math.round((rand.nextDouble()*(max-min)+ min) * 100)/100;
            }
        }
        print(array);
    }

    public void print(double [][]array) {
        for (double[] i : array) {
            System.out.println(Arrays.toString(i));
        }
    }

    public double getMax() {

        double max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (max < array[i][j]) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    public double getMin() {
        double min = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (min > array[i][j]) {
                    min = array[i][j];
                }
            }
        }
        return min;
    }

    public double getArithmeticMean() {
        double sum = 0;
        int temp = 0;
        for (double [] i: array) {
            for (double j : i) {
                sum += j;
                temp++;
            }
        }
        return sum / temp;
    }

    public double getGeometricMean() {
        double comp = 1;
        double temp = 0;
        for (double [] i: array) {
            for (double j : i) {
                comp *= j;
                temp++;
            }
        }
        return Math.pow(comp, 1 / temp);
    }

    public String getLocalMin() {
        int temp = array[0].length - 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 1; j < temp; j++) {
                if (array[i][j] < array[i][j - 1] & array[i][j] < array[i][j + 1]) {
                    return "[" + i + "]" + "[" + j + "]";
                }
            }
        }
        return "" + -1;
    }

    public String getLocalMax() {
        for (int i = 0; i < array.length; i++) {
            int temp = array[i].length - 1;
            for (int j = 1; j < temp; j++) {
                if (array[i][j] > array[i][j - 1] & array[i][j] > array[i][j + 1]) {
                    return "[" + i + "]" + "[" + j + "]";
                }
            }
        }
        return "There is no local maximum, local minimum: " + getLocalMin();
    }

    public void Transpose() {
        if (array.length == array[0].length) {
            for (int i = 0; i < array.length; i++) {
                int temp = i + 1;
                for (int j = temp; j < array[i].length; j++) {
                    double temp1 = array[i][j];
                    array[i][j] = array[j][i];
                    array[j][i] = temp1;
                }
            }
            print(array);
        }
        else {
            double transArray[][] = new double[array[0].length][array.length];
            for (int i = 0; i < transArray.length; i++) {
                for (int j = 0; j < transArray[i].length; j++) {
                    transArray[i][j] = array[j][i];
                }
            }
            print(transArray);


        }
    }
}



