package codewars;

public class DigitalRoot {

    /*
    Digital root is the recursive sum of all the digits in a number.
    Given n, take the sum of the digits of n. If that value has more than one digit,
    continue reducing in this way until a single-digit number is produced.
    The input will be a non-negative integer.
     */

    public static void main(String[] args) {

        System.out.println(digital_root(16));
        System.out.println(digital_root(942));
        System.out.println(digital_root(493193));

    }

    public static int digital_root(int n) {

        int total = 0;

        if (n > 9){

            for (char c : String.valueOf(n).toCharArray()){
                total += Character.getNumericValue(c);
            }

            return digital_root(total);
        }
        return n;
    }

}
