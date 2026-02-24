package Task1;

import java.util.Arrays;

public class Array2DUtils {

    // 1.
    static public double min(double[][] numss) {
        double min = Double.MAX_VALUE;
        for (double[] nums : numss) {
            for (double num : nums) {
                if (num < min)
                    min = num;
            }
        }
        return min;
    }

    // 2.
    static public double[] minOfRow(double[][] numss) {
        double min;
        double[] minOfRow = new double[numss.length];
        int i = 0;
        for (double[] nums : numss) {
            min = Double.MAX_VALUE;
            for (double num : nums) {
                if (num < min)
                    min = num;

            }
            minOfRow[i] = min;
            i++;
        }
        return minOfRow;
    }

    // 3.
    static public double[] minOfCol(double[][] numss) {
        int length = Integer.MIN_VALUE;
        for (double[] nums : numss) {
            if (nums.length > length) length = nums.length;
        }

        double[][] swap = new double[length][length];
        for (double[] minOfCol : swap) {
            Arrays.fill(minOfCol, Double.POSITIVE_INFINITY);
        }
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                try {
                    swap[i][j] = numss[j][i];
                } catch (IndexOutOfBoundsException _) {
                }

            }
        }
        return minOfRow(swap);
    }

        // 4.
    static public double[][] add(double[][] numss1, double[][] numss2) {
        double add1;
        double add2;
        for (double[] ns1 : numss1) {
            for (double n1 : ns1) {

                }
            }
        }
    }
}
