package Level2;

public class InsertStars {

    // Given a string, recursively compute a new string where the identical adjacent characters (two of the same letter) in the original string are separated by a "*".

    public static String insertPairStar(String s) {

        if (s == null) {
            return null;
        }

        if (s.length() == 1) {
            return s;
        }

        String s1 = s.substring(0, 1).toLowerCase();

        if (s.substring(0,1).equals(s.substring(1, 2))) {
            return s.substring(0, 1) + "*" + insertPairStar(s.substring(1));
        } else {
            return s.substring(0, 1) + insertPairStar(s.substring(1));
        }
    }

}
