package Level1;

public class reverseString {

    public static String reverseString(String str){
        String inputString = str;
        StringBuilder outputString = new StringBuilder();

        if (inputString == null) {
            return null;
        } else if (inputString.length() < 2) {
            return inputString;
        } else {
            for (int i = 1; i <= inputString.length(); i++) {
                outputString.append(inputString.charAt(inputString.length()-i));
            }
        }



        return outputString.toString();
    }


    public static void main(String[] args) {

        System.out.println(reverseString("dcba"));
    }
}
