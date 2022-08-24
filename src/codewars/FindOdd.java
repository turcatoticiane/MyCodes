package codewars;

import java.util.HashMap;
import java.util.Map;

public class FindOdd {

    /*
    Given an array of integers, find the one that appears an odd number of times.
    There will always be only one integer that appears an odd number of times.
    Examples
    [7] should return 7, because it occurs 1 time (which is odd).
    [0] should return 0, because it occurs 1 time (which is odd).
    [1,1,2] should return 2, because it occurs 1 time (which is odd).
    [0,1,0,1,0] should return 0, because it occurs 3 times (which is odd).
    [1,2,2,3,3,3,4,3,3,3,2,2,1] should return 4, because it appears 1 time (which is odd).
     */

    public static void main(String[] args) {

        System.out.println(findIt(new int[]{1, 2, 2, 3, 3, 3, 4, 3, 3, 3, 2, 2, 1})); // 4
        System.out.println(findIt(new int[]{0, 1, 0, 1, 0})); // 0

    }

    //I will use a HashMap to count how many times each number appears

    public static int findIt(int[] a) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i : a) {

            if(map.containsKey(i)) {
                map.replace(i, map.get(i), map.get(i)+1);
                continue;
            }
            map.put(i, 1);
        }

        for (int j : map.keySet()){
            if (map.get(j)%2 != 0){
                return j;
            }
        }

        return -1;
    }

}
