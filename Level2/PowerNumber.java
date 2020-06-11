package Level2;

public class PowerNumber {

    // Write a method - pow(x,n) that returns the value of x raised to the power of n (xn). n can be negative!

    // e.g. pow(2,3) ==> 8.0


    public static double pow(double x, int n) {

        if (x < 0) {
            x *= -1;
        }

        if (x == 0 || n == 1) {
            return x;
        }

        if (n <= 0) {
            return pow(x / 2, n+1);
        }

        if (x == 1) {
            return x;
        }

        return pow(x + x, n-1);

    }

}
