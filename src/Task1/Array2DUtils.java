package Task1;

import java.util.Arrays;

public class Array2DUtils {

    // 1.
    public static double min(double[][] numss) {
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
    public static double[] minOfRow(double[][] numss) {
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
    public static double[] minOfCol(double[][] numss) {
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
    public static double[][] add(double[][] numss1, double[][] numss2) {

        int length = Math.max(numss1.length, numss2.length);
        double[][] finalSum = new double[length][];

        for (int i = 0; i < length; i++) {
            double[] sum1 = (i < numss1.length) ? numss1[i] : new double[0];
            double[] sum2 = (i < numss2.length) ? numss2[i] : new double[0];

            int colLength = Math.max(sum1.length, sum2.length);
            finalSum[i] = new double[colLength];


            for (int j = 0; j < colLength; j++) {
//                double val1;
//                double val2;
//                if (j < sum1.length) val1 = sum1[j];
//                else val1 = 0;
//                if (j < sum2.length) val2 = sum2[j];
//                else val2 = 0;
                double val1 = (j < sum1.length) ? sum1[j] : 0;
                double val2 = (j < sum2.length) ? sum2[j] : 0;
                finalSum[i][j] = val1 + val2;
            }

        }
        return finalSum;
    }

    // 5.
    public static double[][] deleteRow(double[][] numss, int idx) {
        int newLength = numss.length - 1;
        double[][] newNumss = new double[newLength][];
        int j = 0;
        for (int i = 0; i < numss.length; i++) {
            if (i != idx) {
                newNumss[j] = numss[i];
                j++;
            }


        }
         return newNumss;
    }

    // 6.
    public static double[][] appendArray(double[][] numss1, double[][] numss2) {
        int appendedLength = numss1.length + numss2.length;
        double[][] appendedArray = new double[appendedLength][];
        int k = 0;
        if (k < appendedLength) {
            for (int i = 0; i < numss1.length; i++) {
                appendedArray[k] = numss1[i];
                k++;
            }
            for (int j = 0; j < numss2.length; j++) {
                appendedArray[k] = numss2[j];
                k++;
            }
        }

        return appendedArray;
    }

    // 7.
    public static double[][] expendArray(double[][] numss1, double[][] numss2) {

    }
}
