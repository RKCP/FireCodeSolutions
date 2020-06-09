package Level1;

import java.util.Arrays;

public class missingNum {

    //Given an Array containing 9 numbers ranging from 1 to 10, write a method to find the missing number. Assume you have 9 numbers between 1 to 10 and only one number is missing.
    //
    //
    //findMissingNumber({1,2,4,5,6,7,8,9,10}) --> 3


    public static int findMissingNumber(int[] arr) {

        int count = 0;

        for (int num : arr) {
            count += num;
        }

        return 55 - count;

    }

    public static void main(String[] args) {
        System.out.println(findMissingNumber(new int[]{6,7,8,9,10,1,2,4,5}));
    }
}
