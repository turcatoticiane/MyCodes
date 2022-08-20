package exads.practicaltest;

public class EvenOrOdd {

    public static void main(String[] args) {

        Integer[] list = {1, 2, 3};
        Integer[] list2 = {2, 4, 6};

        System.out.println(find_total(list));
        System.out.println(find_total(list2));

    }

    public static Integer find_total( Integer[] my_list ) {

        int answer = 0;

        for (int i = 0; i < my_list.length; i++){

            if (i % 2 == 0) {
                answer += my_list[i];
            } else {
                answer -= my_list[i];
            }
        }
        return Integer.valueOf(answer);
    }
}
