package Level2;

public class isPowerOf2 {

    public static boolean isPowOfTwo(int num) {

        return ((num) & (num-1)) == 0;

    }
}
