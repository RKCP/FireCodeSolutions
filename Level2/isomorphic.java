package Level2;

import java.util.HashMap;

public class isomorphic {

    // Given two strings - input1 and input2, determine if they are isomorphic.
    //Two strings are isomorphic if the letters in one string can be remapped to get the second string.
    // Remapping a letter means replacing all occurrences of it with another letter.
    // The ordering of the letters remains unchanged. You can also think of isomorphism as it is used in chemistry - i.e. having the same form or overall shape.
    // Target linear time and space complexity with your solution.


    // Input 1 : css
    // Input 2 : dll
    // Output  : true
    //
    // Input 1 : css
    // Input 2 : dle
    // Output  : false
    //
    // Input 1 : abcabc
    // Input 2 : xyzxyz
    // Output  : true
    //
    // Input 1 : abcabc
    // Input 2 : xbexyz
    // Output  : false


    public static boolean isIsomorphic(String input1, String input2) {

        // basically just count how many of each character, and then check second input has same count.

        HashMap<Character, Integer> uniqueChars = new HashMap<>();
        HashMap<Character, Integer> uniqueChars2 = new HashMap<>();

        for (char c : input1.toCharArray()) {
            uniqueChars.put(c, 0);
        }

        for (char c : input2.toCharArray()) {
            uniqueChars2.put(c, 0);
        }

        return uniqueChars.size() == uniqueChars2.size();
    }
}
