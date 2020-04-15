package Level2;

import java.util.Arrays;

public class Permutations {

    // Implement a method that checks if two strings are permutations of each other.
    //
    // permutation("CAT","ACT") --> true
    //
    // permutation("hello","aloha") --> false


    public static boolean permutation(String str1, String str2) {

        if (str1 == null || str2 == null) {
            return false;
        }

        int string1 = 0;
        int string2 = 0;

        for (char c : str1.toCharArray())  {
            string1 += c;
        }

        for (char c : str2.toCharArray())  {
            string2 += c;
        }

        return string1 == string2;
    }

    public static void main(String[] args) {

        System.out.println(permutation("hello","aloha"));
    }
}
