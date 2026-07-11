import java.util.*;

public class MatrixOperations {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int rows = in.nextInt();
        int cols = in.nextInt();

        int sum = 0;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        int[][] matrix = new int[rows][cols];

        // Input
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        // Calculate sum
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }

        // Find largest element
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > largest) {
                    largest = matrix[i][j];
                }
            }
        }

        // Find smallest element
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < smallest) {
                    smallest = matrix[i][j];
                }
            }
        }

        System.out.println("Sum = " + sum);
        System.out.println("Largest = " + largest);
        System.out.println("Smallest = " + smallest);
      
    }
}
