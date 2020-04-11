package Level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class duplicateNums {


    // Write a method duplicate to find the repeated or duplicate elements in an array.
    // This method should return a list of repeated integers in a string with the elements sorted in ascending order (as illustrated below).
    //
    //
    // duplicate({1,3,4,2,1}) --> "[1]"
    //
    // duplicate({1,3,4,2,1,2,4}) --> "[1, 2, 4]"
    //
    //
    //
    // Note: You may use toString() method to return the
    // standard string representation of most data structures, and
    // Arrays.sort() to sort your result.

    public static String duplicate(int[] numbers){

        Arrays.sort(numbers);

        ArrayList<Integer> unique = new ArrayList<>();
        ArrayList<Integer> duplicates = new ArrayList<>();

        for (int num : numbers) {
            if (!unique.contains(num)) {
                unique.add(num);
            } else {
                duplicates.add(num);
            }
        }

        return Arrays.toString(duplicates.toArray());


    }


    public static void main(String[] args) {

        int array[] = {1,3,4,2,1,2,4};

        System.out.println(duplicate(array));
    }


}
