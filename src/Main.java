import Task1.*;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[][] n = new double[][]{
                {1,5,8},
                {3,2,6,5,1,6},
                {9,4,1}
        };

        double[][] d = new double[][] {
                {1},
                {2},
                {3},
                {4},
                {5},
                {6},
                {7},
                {8},
                {9}
        };

        double[][] n1 = new double[][]{
                {1, 2, 3},
                {4, 5}
        };

        double[][] n2 = new double[][]{
                {1, 2, 8},
                {3, 4, 5},
                {6, 7, 9}
        };

        System.out.println("1)");
        System.out.println(Array2DUtils.min(n));

        System.out.println("\n2)");
        System.out.println(Arrays.toString(Array2DUtils.minOfRow(n)));

        System.out.println("\n3)");
        System.out.println(Arrays.toString(Array2DUtils.minOfCol(n)));

        System.out.println("\n4)");
        System.out.println(Arrays.deepToString(Array2DUtils.add(n1, n2)));

        System.out.println("\n5)");
        System.out.println(Arrays.deepToString(Array2DUtils.deleteRow(d, 5)));

        System.out.println("\n6)");
        System.out.println(Arrays.deepToString(Array2DUtils.appendArray(d, d)));

        System.out.println("\n7)");
        System.out.println(Arrays.deepToString(Array2DUtils.expendArray(d, n)));

        System.out.println("\n8)");
        System.out.println(Arrays.deepToString(Array2DUtils.transposeMatrix(n2)));
    }

}