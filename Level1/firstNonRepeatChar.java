package Level1;

public class firstNonRepeatChar {

    // Find the first non-duplicate character in a string. Return null if no unique character is found.
    //
    // firstNonRepeatedCharacter( "abcdcd" ) --> 'a'
    // firstNonRepeatedCharacter( "cbcd" ) --> 'b'
    // firstNonRepeatedCharacter( "cdcd" ) --> null

    public static Character firstNonRepeatedCharacter(String str) {

        char[] array = str.toCharArray();

        char currentNonRepeated = ' ';



        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                currentNonRepeated = array[i];
                if (array[j] == currentNonRepeated) {
                    count++;
                    if (count > 1) {
                        break;
                    }
                }
            }
            if (count == 1) {
                return array[i];
            }
        }

        return null;
    }


    public static void main(String[] args) {
        System.out.println(firstNonRepeatedCharacter("abcdcd"));
    }

}
