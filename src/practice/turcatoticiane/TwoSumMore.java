package practice.turcatoticiane;

import java.util.*;

public class TwoSumMore {

    public static void main(String[] args) {

        System.out.println(firstTwoSum(new int[]{2, 7, 11, 15, 3, 6}, 9)); // 0 + 1 = 1
        System.out.println(firstTwoSum2(new int[]{2, 7, 11, 15, 3, 6, 7, 3}, 9)); // 0 + 1 = 1

        System.out.println(twoSum(new int[]{2, 7, 11, 15, 3, 6}, 9)); // 0 + 1 + 4 + 5 = 10
        System.out.println(twoSum(new int[]{2, 7, 11, 15, 3, 6, 7, 3}, 9)); //28

        System.out.println(strictSum(new int[]{2, 7, 11, 15, 3, 6, 7, 3}, 9)); // 0 + 1 + 4 + 5 = 10

    }

    public static int firstTwoSum(int[] arr, int target) {

        int result = 0;
        List<Integer> list = new ArrayList<>();

        for (int i=0; i < arr.length - 1; i++){

            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target){
                    list.add(i);
                    list.add(j);
                }
            }
        }
        result = list.get(0) + list.get(1);
        return result;
    }

    public static int firstTwoSum2(int[] arr, int target) {

        int result = 0;

        for (int i=0; i < arr.length - 1; i++){
            for (int j = i+1; j < arr.length; j++) {
                if (result > 0) {
                    return result;
                }
                if (arr[i] + arr[j] == target){
                    result = i + j;
                }
            }
        }
        return result;
    }

    public static int twoSum(int[] arr, int target) {

        int result = 0;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    list.add(i);
                    list.add(j);
                }
            }
        }

        for (int i : list) {
            result += i;
        }
        return result;
    }

    public static int strictSum(int[] arr, int target) {

        int result = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    if(!map.containsKey(i) && !map.containsKey(j)) {
                        map.put(i, target);
                        map.put(j, target);
                    }
                }
            }
        }

        for (Integer i : map.keySet()) {
            result += i;
        }

        return result;
    }

}
