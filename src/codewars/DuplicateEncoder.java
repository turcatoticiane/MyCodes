package codewars;

public class DuplicateEncoder {

    /*The goal of this exercise is to convert a string to a new string
    where each character in the new string is "(" if that character appears
    only once in the original string, or ")" if that character appears more
    than once in the original string. Ignore capitalization when determining
    if a character is a duplicate.*/

    public static void main(String[] args) {

        System.out.println(encode("din")); // "((("
        System.out.println(encode("recede")); // "()()()"
        System.out.println(encode("Success")); // ")())())"
        System.out.println(encode("(( @")); // "))(("

    }

    static String encode(String word){

        String result = "";
        char[] wordArr = word.toLowerCase().toCharArray();

        for (int i=0; i < wordArr.length; i++) {
            //System.out.println("i : " + i + "; result: " + result);
            for (int j = 0; j < wordArr.length; j++) {
                //System.out.println("j : " + j);
                if (i == j && j == wordArr.length - 1) {
                    result += "(";
                    break;
                }
                if (i == j) {
                    continue;
                }
                if (wordArr[i] == wordArr[j]) {
                    result += ")";
                    break;
                }
                if (j == wordArr.length - 1) {
                    result += "(";
                }
            }
        }
        return result;
    }

    /*
    static String encode(String word){

        word = word.toLowerCase();
        String result = "";

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            result += word.lastIndexOf(c) == word.indexOf(c) ? "(" : ")";
        }
        return result;
    }
     */
}