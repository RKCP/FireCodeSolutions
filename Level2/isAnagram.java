package Level2;

import java.util.Arrays;

public class isAnagram {

    // isAnagram("abc","cab") => true
    // isAnagram("b","b") => true
    // isAnagram("bd","cb") => false

    public static boolean isAnagram(String input1, String input2) {

        if (input1 == null || input2 == null) {
            return false;
        }

        char[] array1 = input1.toCharArray();
        char[] array2 = input2.toCharArray();
        int sum1 = 0;
        int sum2 = 0;

        for (char c : array1) {
            sum1 += c;
        }

        for (char c : array2) {
            sum2 += c;
        }

        return sum1 == sum2;

    }

    public static void main(String[] args) {

        System.out.println(isAnagram("abc", "cbh"));
    }
}
