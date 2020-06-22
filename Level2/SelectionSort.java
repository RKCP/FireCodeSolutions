package Level2;

import java.util.Arrays;

public class SelectionSort {

    // Write a method that uses the selection sort algorithm to sort an input array of integers.

    public static int[] selectionSortArray(int[] arr){

        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
