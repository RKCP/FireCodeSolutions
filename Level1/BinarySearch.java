package Level1;

import java.io.IOException;
import java.util.ArrayList;

public class BinarySearch {

    // Write a method that searches an Array of integers for a given integer using the
    // Binary Search Algorithm. If the input integer is found in the array, return true. Otherwise, return false.
    // You can assume that the given array of integers is already sorted
    // in ascending order.
    // Examples:
    //
    // binarySearch({2,5,7,8,9},9) -> true
    //
    // binarySearch({2,8,9,12},6) -> false
    //
    // binarySearch({2},4) -> false
    //
    // binarySearch({},9) -> false
    //
    // {} -> [Empty] Array

    public static Boolean binarySearch(int[] arr, int n){

        if (arr.length == 0) {
            return false;
        }

        if (arr.length == 1) {
            return arr[0] == n;
        }

        int middleIndex = arr.length/2;

        if (arr[middleIndex] == n) {
            return true;
        }

        ArrayList<Integer> halvedArray = new ArrayList<>();

        if (n > arr[middleIndex]) {
            for (int i = middleIndex; i < arr.length; i++) {
                halvedArray.add(arr[i]);
            }
        } else if (n < arr[middleIndex]) {
            for (int i = 0; i < middleIndex; i++) {
                halvedArray.add(arr[i]);
            }
        }

        int newArray[] = new int[halvedArray.size()];

        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = halvedArray.get(i);
        }


        return binarySearch(newArray, n);
    }



    public static void main(String[] args) {

        String input = "ABCDE";

        StringBuilder output = new StringBuilder();

        output.append(input.charAt(0));

        System.out.println(output.toString());

        int array[] = {2,8,9,12};

        System.out.println(binarySearch(array, 6));
    }



}
