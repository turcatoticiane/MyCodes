package practice.turcatoticiane;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PickPeaks {

    /*
    In this kata, you will write a function that returns the positions and the
    values of the "peaks" (or local maxima) of a numeric array.
    For example, the array arr = [0, 1, 2, 5, 1, 0] has a peak at position 3 with
    a value of 5 (since arr[3] equals 5).
    The output will be returned as a ``Map<String,List>with two key-value pairs:
    "pos"and"peaks". If there is no peak in the given array, simply return {"pos" => [], "peaks" => []}`.
    Example: pickPeaks([3, 2, 3, 6, 4, 1, 2, 3, 2, 1, 2, 3]) should return {pos: [3, 7],
    peaks: [6, 3]} (or equivalent in other languages)
    All input arrays will be valid integer arrays (although it could still be empty),
    so you won't need to validate the input.
    The first and last elements of the array will not be considered as peaks
    (in the context of a mathematical function, we don't know what is after and before and therefore,
    we don't know if it is a peak or not).
    Also, beware of plateaus !!! [1, 2, 2, 2, 1] has a peak while [1, 2, 2, 2, 3] and [1, 2, 2, 2, 2] do not.
    In case of a plateau-peak, please only return the position and value of the beginning of the plateau.
    For example: pickPeaks([1, 2, 2, 2, 1]) returns {pos: [1], peaks: [2]} (or equivalent in other languages)
     */

    public static void main(String[] args) {

        int[] arr = {1,2,3,6,4,1,2,3,2,1}; // should return {pos: [3, 7], peaks: [6, 3]}
        System.out.println(getPeaks(arr));

        int[] arr2 = {3,2,3,6,4,1,2,3,2,1,2,2,2,1}; // should return {pos: [3, 7, 10], peaks: [6, 3, 2]}
        System.out.println(getPeaks(arr2));

        int[] arr3 = {2,1,3,1,2,2,2,2}; // should return {pos: [2], peaks: [3]}
        System.out.println(getPeaks(arr3));

    }

    /* essa seria a minha resposta, mas apesar de dar certo com os testes que tenho aqui,
    quando submeto no codewars ele não passa em um teste, dizendo
    "Index -1 out of bounds for length 0"

    public static Map<String, List<Integer>> getPeaks(int[] arr) {

        Map<String, List<Integer>> answer = new HashMap<>();
        answer.put("pos", new ArrayList<>());
        answer.put("peaks", new ArrayList<>());

        if(arr.length == 0){
            return answer;
        }

        for(int i = 1; i < arr.length-1; i++){

            if (arr[i] > arr[i-1] && arr[i] >= arr[i+1]){

                answer.get("pos").add(i);
                answer.get("peaks").add(arr[i]);

                if(arr[i] == arr[i+1]){
                    int min = arr[i];
                    for (int j = i+1; j < arr.length; j++){
                        if (arr[j] < min) {
                            min = arr[j];
                        }
                    }
                    if(arr[i] == min){
                        answer.get("pos").remove(answer.get("pos").size()-1);
                        answer.get("peaks").remove(answer.get("peaks").size()-1);
                    }
                }

            }
        }

        return answer;
    }
     */

    public static Map<String, List<Integer>> getPeaks(int[] arr) {

        Map<String, List<Integer>> answer = new HashMap<>();
        answer.put("pos", new ArrayList<>());
        answer.put("peaks", new ArrayList<>());

        int posMax = 0;
        boolean b = false;

        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > arr[i-1]){
                b = true;
                posMax = i;
            }
            if(b && arr[i] < arr[i-1]){
                b = false;
                answer.get("pos").add(posMax);
                answer.get("peaks").add(arr[posMax]);
            }
        }
        return answer;
    }

}
