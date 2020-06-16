package Level2;

public class ReverseInteger {


    // Implement a method that reverses an integer - without using additional heap space
    // Examples:
    // -123 ==> -321
    // 123 ==> 321

    public static int reverseInt(int x) {

        if (x >= 0 && x < 10) {
            return x;
        }
        boolean originalNegative = false;

        if (x < 0) {
            originalNegative = true;
            x *= -1;
        }

        StringBuilder reversedNumber = new StringBuilder();

        while(x > 0) {

            reversedNumber.append(x % 10);
            x /= 10;
        }

        int result = Integer.parseInt(reversedNumber.toString());

        if (originalNegative) {
            result *= -1;
        }

        return result;

    }
}
