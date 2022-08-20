package codewars;

import java.util.ArrayList;
import java.util.List;

public class DeadFishSwim {

    /*Deadfish has 4 commands, each 1 character long:
    i increments the value (initially 0)
    d decrements the value
    s squares the value
    o outputs the value into the return array
    Invalid characters should be ignored.
    ex: Deadfish.parse("iiisdoso") =- new int[] {8, 64};
    */

    //swift e if funcionam, mas não pegam o caso de ter erros na String data
    //nova alternativa com ArrayList
    //Lembrando que: IMPORTA O ESCOPO DA VARIÁVEL!!!

    public static void main(String[] args) {

        String data = "iiisdoso";
        String data2 = "iiisdosodddddiso";
        System.out.println(parse(data));
        System.out.println(parse(data2));

    }

    /*public static int[] parse(String data) {

        int[] result = new int[data.split("o").length];
        int currentValue = 0;
        int index = 0;

        for (int i = 0; i < data.length(); i++) {

            char currentChar = data.charAt(i);

            //alternativa utilizando if, com array
            if (Character.valueOf(currentChar).equals('i')){
                currentValue++;
                continue;
            }
            if (Character.valueOf(currentChar).equals('d')){
                currentValue--;
                continue;
            }
            if (Character.valueOf(currentChar).equals('s')){
                currentValue *= currentValue;
                continue;
            }
            if (Character.valueOf(currentChar).equals('o')){
                result[index] = currentValue;
                //System.out.println(result[index]);
                index++;
            }

            //alternativa usando switch, com array
            switch (currentChar){
                case 'i':
                    currentValue++;
                    continue;
                case 'd':
                    currentValue--;
                    continue;
                case 's':
                    currentValue *= currentValue;
                    continue;
                case 'o':
                    result[index] = currentValue;
                    //System.out.println(result[index]);
                    index++;
                    continue;
                default:
                    continue;
            }
        }
        //System.out.println(result.length);
        return result;
    }*/

    public static int[] parse(String data) {

        List<Integer> list = new ArrayList<>();
        int currentValue = 0;

        for (char currentChar: data.toCharArray()) {

            switch (currentChar) {
                case 'i':
                    currentValue++;
                    continue;
                case 'd':
                    currentValue--;
                    continue;
                case 's':
                    currentValue *= currentValue;
                    continue;
                case 'o':
                    list.add(currentValue);
                    continue;
                default:
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
            System.out.println(result[i]);
        }

        return result;
    }

}
