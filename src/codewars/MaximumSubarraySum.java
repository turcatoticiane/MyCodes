package codewars;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MaximumSubarraySum {

    /*
    The maximum sum subarray problem consists in finding the maximum sum
    of a contiguous subsequence in an array or list of integers.
    Easy case is when the list is made up of only positive numbers and
    the maximum sum is the sum of the whole array. If the list is made up
    of only negative numbers, return 0 instead.
    Empty list is considered to have zero greatest sum. Note that the empty
    list or array is also a valid sublist/subarray.
     */

    //eu preciso ir somando todas as combinações possíveis e checar qual a maior.
    //posso fazer isso com um map? coloco o total na key e o array no value

    public static void main(String[] args) {

        System.out.println(sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));

    }

    public static int sequence(int[] arr) {

        Map<Integer, ArrayList> results = new HashMap<>();
        List<Integer> arrayList = new ArrayList<>();
        int sum = 0;
        int answer = 0;

        for(int i=0; i < arr.length; i++){
            sum = 0;
            arrayList.clear();
            sum += arr[i];
            arrayList.add(arr[i]);
            for (int j = i + 1; j < arr.length; j++){
                sum += arr[j];
                arrayList.add(arr[j]);
                results.put(sum, (ArrayList) arrayList);
            }
        }

        for (int i : results.keySet()){
            if(answer < i){
                answer = i;
            }
        }

        return answer;
    }


}
