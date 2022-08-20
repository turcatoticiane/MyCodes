package exads.practicaltest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GroceryList {

    public static void main(String[] args) {
        //product, price per unit(integer), amount to buy (integer)
        String[] test1 = {"apples 5 1", "oranges 6 1"};
        String[] test2 = {"bread -1;1", "milk -2 1"};
        String[] test3 = {"butter M N", "milk 1 1"};
        String[] test4 = {"cucumber -2 10"};

        System.out.println(total(test1));
        System.out.println(total(test2));
        System.out.println(total(test3));
        System.out.println(total(test4));

    }

    /*public static String total(String[] groceryList){

        String answer = "";
        Integer total = 0;
        List<String[]> list = new LinkedList<>();
        List<Integer> spend = new LinkedList<>();

        for (int i = 0; i < groceryList.length; i++) {

            list.add(groceryList[i].split("[^a-zA-Z0-9]+"));

        }

        for (String[] item : list) {

            System.out.println(item[0] + "+" + item[1] + "+" + item[2]);

            if (item[1].matches("[0-9]+") && item[2].matches("[0-9]+")){
                //System.out.println("true");
                int itemValue = Integer.parseInt(item[1]) * Integer.parseInt(item[2]);
                total += itemValue;
                spend.add(itemValue);
            }
        }

        for (int i = 0; i < spend.size(); i++) {

            if (i == (spend.size()-1)){
                answer += spend.get(i) + "=";
                continue;
            }
            answer += spend.get(i) + "+";
        }

        return answer + total;
    }*/

    public static String total( String[] groceryList ) {

        String answer = "";
        Integer total = 0;
        Integer[] priceUnit = new Integer[groceryList.length];
        Integer[] itemQuant = new Integer[groceryList.length];


        for (int i = 0; i < groceryList.length; i++){

            String[] item = groceryList[i].split("[^a-zA-Z0-9]+");

            if (item[1].matches("[0-9]+") && item[2].matches("[0-9]+")){

                int totalUnit = 0;

                priceUnit[i] = Integer.parseInt(item[1]);
                itemQuant[i] = Integer.parseInt(item[2]);

                totalUnit = priceUnit[i]*itemQuant[i];
                total += totalUnit;

                if (i == (groceryList.length - 1)){
                    answer += totalUnit + "=";
                    continue;
                }
                answer += totalUnit + "+";
            }
        }
        return answer + total;
    }



}
