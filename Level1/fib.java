package Level1;

import java.util.*;

public class fib {


    // java.util.* and java.util.streams.* have been imported for this problem.
    // You don't need any other imports.

    // return the nth fibonacci number
    // assume no higher than 15 fibonacci numbers

    public static int fib(int n) {

        //base case
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n-1) + fib(n-2);
        }
    }


    public static void main(String[] args) {
        System.out.println(fib(9));
    }
}
