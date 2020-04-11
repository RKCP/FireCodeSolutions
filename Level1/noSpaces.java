package Level1;

public class noSpaces {


    // Write a method to replace all spaces in a string with a given replacement string.

    // replace("This is a test","/") --> "This/is/a/test"
    //
    //
    //
    //Note: Avoid using the in-built String.replaceAll() method.


    public static String replace(String a, String b) {

        String[] words = a.split(" ");
        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < words.length - 1; i++) {
            newString.append(words[i] + b);
        }

        newString.append(words[words.length-1]);

        return newString.toString();
    }

    public static String reverseString(String str){
        String inputString = str;
        StringBuilder outputString = new StringBuilder();

        if (inputString == null) {
            return null;
        }

        for (int i = inputString.length()-1; i >= 0; i--) {
            outputString.append(inputString.charAt(i));
        }

        return outputString.toString();
    }

    public static void main(String[] args) {
        System.out.println(replace("This is a test","jkhv/"));
    }
}
