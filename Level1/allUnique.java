package Level1;

import java.util.HashMap;

public class allUnique {

    public static boolean areAllCharactersUnique(String str){

        char[] array = str.toCharArray();

        HashMap<Character, Integer> uniqueLetters = new HashMap<>(); // stores only unique things, no duplicates. If the length of this doesn't match length of str, return false

        for (char c : array) {
            uniqueLetters.put(c, 0);
        }

        return uniqueLetters.size() == str.length();
    }

    public static void main(String[] args) {

        System.out.println(areAllCharactersUnique("abcdee"));
    }
}
