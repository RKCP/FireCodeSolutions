package Level1;

import java.util.ArrayList;
import java.util.HashMap;

public class appearsOnce {

    //Write a method that returns a number that appears only once in an array.
    //Assume the array will surely have a unique value. The array will never be empty.
    //Examples:
    //
    //{1,2,3,4,1,2,4,3,5} ==> 5


    public static int singleNumber(int[] A) {

        ArrayList<Integer> foundNums = new ArrayList<>();
        int currentSingleNum = 0;

        for (int num : A) {
            foundNums.add(num);
        }

        for (int i = 0; i < foundNums.size(); i++) {
            currentSingleNum = foundNums.get(i);
            int count = 0;
            for (int j = 0; j < foundNums.size(); j++) {
                if (currentSingleNum == foundNums.get(j)) {
                    count++;
                }
            }
            if (count == 1) {
                break;
            }
        }

        return currentSingleNum;

    }


    public static void main(String[] args) {

        int array[] = {1,2,3,4,1,2,4,3,5};

        System.out.println(singleNumber(array));
    }
}
