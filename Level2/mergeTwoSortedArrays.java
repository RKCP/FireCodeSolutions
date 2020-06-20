package Level2;

import java.util.ArrayList;
import java.util.Arrays;

public class mergeTwoSortedArrays {


    // The idea behind the classic MergeSort algorithm is to divide an array in half, sort each half, and then use
    // a merge() method to merge the two halves into a single sorted array.
    //
    //
    // Implement the merge() method that takes in two sorted arrays and returns a third sorted array that contains elements of both the input arrays.
    //
    // You can assume that the input arrays will always be sorted in ascending order and can have different sizes.

    // merge({2,5,7,8,9},{9}) -> {2,5,7,8,9,9}
    // merge()({7,8},{1,2}) -> {1,2,7,8}
    // merge()({2},{}) -> {2}
    // merge({}) -> [Empty] Array


    public static int[] merge(int[] arrLeft, int[] arrRight){

        int[] mergedArray = new int[arrLeft.length + arrRight.length];

        // copy arrays
        for (int i = 0; i < arrLeft.length; i++) {
            mergedArray[i] = arrLeft[i];
        }

        int position = arrLeft.length;

        for (int i = 0; i < arrRight.length; i++) {
            mergedArray[position] = arrRight[i];
            position++;
        }

        // sort
        for (int i = 0; i < mergedArray.length; i++) {
            for (int j = i + 1; j < mergedArray.length; j++) {

                if (mergedArray[i] > mergedArray[j]) {
                    int temp = mergedArray[i];
                    mergedArray[i] = mergedArray[j];
                    mergedArray[j] = temp;
                }
            }
        }

        return mergedArray;

    }

}
