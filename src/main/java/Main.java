package main.java;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(2, 1, 4, 3, 5, 7, 6));

        Set<Integer> set = new TreeSet<>((Integer o1, Integer o2) -> {

            boolean o1even = o1 % 2 == 0;
            boolean o2even = o2 % 2 == 0;

            boolean bothEven = o1even & o2even;
            boolean bothOdd = !o1even & !o2even;

            if (bothEven | bothOdd) {
                return o1.compareTo(o2);
            } else if (o1even & !o2even) {
                return -1;
            } else {
                return 1;
            }
        });

        set.addAll(list);
        System.out.println(set);
    }
}
