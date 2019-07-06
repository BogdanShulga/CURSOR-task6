package main.java;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(2, 1, 4, 3, 5, 7, 6));

        Set<Integer> set = new TreeSet<>((Integer o1, Integer o2) -> {

            boolean one = o1 % 2 == 0;
            boolean two = o2 % 2 == 0;

            if (one & two | !one & !two) {
                return o1.compareTo(o2);
            } else if (one & !two) {
                return -1;
            } else {
                return 1;
            }
        });

        set.addAll(list);
        System.out.println(set);
    }
}
