package Level2;

import java.util.HashMap;

public class BinaryRep {

    // Write a method to compute the binary representation of a positive integer. The method should return a string with 1s and 0s.
    //
    // computeBinary(6) ==> "110"
    // computeBinary(5) ==> "101"


    public static String computeBinary(int val) {

        if (val == 0) {
            return "0";
        }
        StringBuilder num = new StringBuilder();

        while (val >= 1) {
            num.append(val % 2);
            val /= 2;
        }
        return num.reverse().toString();
    }

}
