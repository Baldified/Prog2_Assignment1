package Task1;

public class Array2DUtils {

    // 1.
    static public double min(double[][] numss) {
        double min = Double.MAX_VALUE;
        for (double[] nums : numss) {
            for (double num : nums) {
                if (num < min) {
                    min = num;
                }
            }
        }
        System.out.println(min);
        return min;
    }

    // 2.
    static public double[] minOfRow(double[][] numss) {
        double min = Double.MAX_VALUE;
        for (double[] nums : numss) {

        }
    }
}
