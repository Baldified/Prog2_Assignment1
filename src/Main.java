import Task1.*;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[][] numss = new double[][]{
                {1,5,8},
                {3,2,6,16,21,5,1,463,21,5413,5},
                {9,4,1},
        };
        System.out.println(Array2DUtils.min(numss));

        System.out.println(Arrays.toString(Array2DUtils.minOfRow(numss)));
        System.out.println(Arrays.toString(Array2DUtils.minOfCol(numss)));
    }
}