package Level1;

import java.util.Arrays;

public class flipVerticalAxis {

    // You are given an m x n 2D image matrix where each integer represents a pixel. Flip it in-place along its vertical axis.
    //
    // Example:
    // Input image :
    //              1 0
    //              1 0
    //
    // Modified to :
    //              0 1
    //              0 1


    // Example:
    // Input image :
    //             1,2,3
    //             4,5,6
    //             7,8,9
    //
    // Modified to :
    //             3 2 1
    //             6 5 4
    //             9 8 7

    public static void flipItVerticalAxis(int[][] matrix) {

        int rows = matrix.length;
        int columns = matrix[0].length;

        for (int i = 0; i < rows; i ++ ) {
            for (int j = 0; j < columns/2; j++) {

                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][columns-j-1];
                matrix[i][columns - j-1] = temp;
            }
        }
    }


    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        flipItVerticalAxis(array);

        for (int arrays[] : array) {
            System.out.println(Arrays.toString(arrays));
        }
    }
}
