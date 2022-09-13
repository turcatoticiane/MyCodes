package practice.turcatoticiane;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetTest {

    // Tests with Set Class

    public static void main(String[] args) {

        Set<Integer> setList = new HashSet<>();
        setList.add(1);
        setList.add(2);
        setList.add(3);

        System.out.println(Arrays.toString(setList.toArray()));
        System.out.println(setList.contains(1));
        System.out.println(setList.contains(4));
        System.out.println(setList.size());

        setList.add(3);
        System.out.println(Arrays.toString(setList.toArray()));

    }

}
