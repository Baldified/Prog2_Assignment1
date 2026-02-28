import Task1.*;
import Task2.*;
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
                {1, 2, 3},
                {4, 5, 6}
        };

        System.out.println("TASK 1\n");
        
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

        System.out.println("\nTASK 2\n");

        Animal a1 = new Animal("bob", "male", 5, "Dog");
        Animal a2 = new Animal("Mogi", "male", 3, "Monkey");

        System.out.println(a1.toString());
        System.out.println(a1.equals(a2));

        }
}