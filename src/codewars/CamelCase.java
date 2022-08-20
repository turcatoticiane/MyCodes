package codewars;

public class CamelCase {

    public static void main(String[] args) {

        String input = "ticianeTurcato";
        System.out.println(camelCase(input));

    }

    public static String camelCase(String input) {

        String output = "";

        for (int i = 0; i < input.length(); i++) {

            char upperChar = input.charAt(i);

            if (Character.isUpperCase(upperChar)){
                output += " " + upperChar;
                continue;
            }
            output += upperChar;
        }
        return output;
    }
}
