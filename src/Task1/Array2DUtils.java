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
//        int length = Integer.MIN_VALUE;
//        for (double[] nums : numss) {
//            if (nums.length > length) length = nums.length;
//        }
//
//        double[][] swap = new double[length][length];
//        for (double[] minOfCol : swap) {
//            Arrays.fill(minOfCol, Double.POSITIVE_INFINITY);
//        }
//        for (int i = 0; i < length; i++) {
//            for (int j = 0; j < length; j++) {
//                try {
//                    swap[i][j] = numss[j][i];
//                } catch (IndexOutOfBoundsException _) {
//                }
//
//            }
//        }
//        return minOfRow(swap);
        int length = 0;
        for (double[] col : numss)
            if (col.length > length)
                length = col.length;

        double[] minOfCol = new double[length];
        Arrays.fill(minOfCol, Double.POSITIVE_INFINITY);

        for (double[] doubles : numss) {
            for (int j = 0; j < doubles.length; j++) {
                if (doubles[j] < minOfCol[j]) minOfCol[j] = doubles[j];
            }
        }

        return minOfCol;
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
            for (double[] nums1 : numss1) {
                appendedArray[k] = nums1;
                k++;
            }
            for (double[] nums2 : numss2) {
                appendedArray[k] = nums2;
                k++;
            }
        }

        return appendedArray;
    }

    // 7.
    public static double[][] expendArray(double[][] numss1, double[][] numss2) {
        int rowLength = Math.max(numss1.length, numss2.length);
        double[][] expendedArray = new double[rowLength][];

        for (int i = 0; i < rowLength; i++) {
            int col1 = (i < numss1.length) ? numss1[i].length : 0;
            int col2 = (i < numss2.length) ? numss2[i].length : 0;

            int colLength = col1 + col2;

            expendedArray[i] = new double[colLength];
            for (int j = 0; j < colLength; j++) {
                if (j < col1)
                    expendedArray[i][j] = numss1[i][j];
                else {
                    expendedArray[i][j] = numss2[i][j - col1];
                }
            }
        }

        return expendedArray;
    }

    // 8.
    public static double[][] transposeMatrix(double[][] numss) {
        int row = numss.length;
        int col = Integer.MIN_VALUE;
        double[][] transpose;
        for (int i = 0; i < row; i++) {
            if (numss[i].length > col) col = numss[i].length;
        }
        transpose = new double[col][];


        for (int j = 0; j < col; j++) {

            transpose[j] = new double[row];

            for (int k = 0; k < row; k++) {
                transpose[j][k] = numss[k][j];
            }
        }
        return transpose;
    }
}
