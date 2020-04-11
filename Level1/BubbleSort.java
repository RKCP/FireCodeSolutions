package Level1;

import java.util.Arrays;

public class BubbleSort {

    // Write a method that takes in an array of ints and uses the Bubble Sort algorithm to sort the array 'in place' in ascending order.
    // The method should return the same, in-place sorted array.
    //
    // Note: Bubble sort is one of the most inefficient ways to sort a large array of integers.
    // Nevertheless, it is an interview favorite. Bubble sort has a time complexity of O(n2).
    // However, if the sample size is small, bubble sort provides a simple implementation of a classic sorting algorithm.


    // bubbleSortArray({5,4,3}) -> {3,4,5}
    // bubbleSortArray({3}) -> {3}
    // bubbleSortArray({}) -> {}
    // {} -> [Empty] Array

    public static int[] bubbleSortArray(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {

        int[] array = {5,4,3,23,1,2};

        //System.out.println(Arrays.toString(bubbleSortArray(array)));

        System.out.println(areAllCharactersUnique("abcdee"));
    }

    public static boolean areAllCharactersUnique(String str){

        if (str == null) {
            return true;
        }

        char[] charArray = str.toCharArray();
        int count = 0;

        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < charArray.length; j++) {
                if (charArray[i] == charArray[j]) {
                    count++;
                }
            }
        }

        return count == str.length();
    }
}
