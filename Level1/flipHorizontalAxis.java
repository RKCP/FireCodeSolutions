package Level1;

import java.util.Arrays;

public class flipHorizontalAxis {

    // You are given an m x n 2D image matrix where each integer represents a pixel. Flip it in-place along its horizontal axis.

    // eg 11  ->  00
    //    00  ->  11

    // Once you have the row / column dimensions, write 2 for loops that traverse the entire matrix. In the inner for loop, use a temporary variable to make the swap.

    public static void flipHorizontalAxis(int[][] matrix) {

        int rows = matrix.length;
        int columns = matrix[0].length; // divide 2 because when we swap, we don't need to go through every single row/column. By the time we swap haflway, everything would have been swapped.

        for (int i = 0; i < rows/2; i++) {
            for (int j = 0; j < columns; j++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[i+rows-1][j];
                matrix[i+rows-1][j] = temp;
            }
        }
    }

    public static void main(String[] args) {

        int array[][] = {{1,1},{0,0}};

        for (int[] nums : array) {
            System.out.println("ARRAY BEFORE: " + Arrays.toString(nums));
        }

        flipHorizontalAxis(array);

        for (int[] nums : array) {
            System.out.println("ARRAY AFTER: " + Arrays.toString(nums));
        }

    }
}
