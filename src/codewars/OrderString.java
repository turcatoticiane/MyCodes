package codewars;

public class OrderString {

    /*
    Your task is to sort a given string. Each word in the string will contain a single number.
    This number is the position the word should have in the result.
    Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).
    If the input string is empty, return an empty string. The words in the input String will only
    contain valid consecutive numbers.
    */

    public static void main(String[] args) {

        String words = "is2 Thi1s T4est 3a";
        System.out.println(order(words));

    }

    public static String order(String words){

        String[] myWords = words.split(" ");
        String[] result = new String[myWords.length];

        if (words.isEmpty()){
            return "";
        }

        for (int i = 0; i < myWords.length; i++) {
            for (int j = 0; j < myWords[i].length(); j++) {
                if (Character.isDigit(myWords[i].charAt(j))) {
                    result[(Character.getNumericValue(myWords[i].charAt(j)))-1] = myWords[i];
                }
            }
        }
        return String.join(" ", result);
    }

}
