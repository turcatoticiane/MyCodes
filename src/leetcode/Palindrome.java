package leetcode;

public class Palindrome {

    //check if the String ou int is a palindrome

    public static void main(String[] args) {

        int x = 121;
        String s = "abc";

        System.out.println(isPalindrome(x));
        System.out.println(isPalindrome(s));

    }

    public static boolean isPalindrome(int x) {

        String num = String.valueOf(x);
        String reverseNum = "";

        //System.out.println(num);

        for (int i = num.length() -1; i >= 0; i--) {
            reverseNum += String.valueOf(num.charAt(i));
        }

        //System.out.println(reverseNum);

        if (num.equalsIgnoreCase(reverseNum)){
            return true;
        }
        return false;
    }


    public static boolean isPalindrome(String s) {

        String reverseString = "";

        for (int i = s.length() -1; i >= 0; i--) {
            reverseString += String.valueOf(s.charAt(i));
        }

        //System.out.println(reverseNum);

        if (s.equalsIgnoreCase(reverseString)){
            return true;
        }
        return false;
    }


}
