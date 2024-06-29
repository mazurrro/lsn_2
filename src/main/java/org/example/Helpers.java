package org.example;

import java.util.*;

public class Helpers {
    final static int sum = 13;

    public static List<int[]> getPairs(List<Integer> list) {
        Set<Integer> checked = new HashSet<>();
        List<int[]> pairs = new ArrayList<>();

        for (Integer number : list) {
            int supplement = sum - number;
            if (checked.contains(supplement)) {
                if (number > supplement) {
                    pairs.add(new int[]{supplement, number});
                } else {
                    pairs.add(new int[]{number, supplement});
                }
            }
            checked.add(number);
        }
        return sort(pairs);
    }

    private static List<int[]> sort(List<int[]> list) {
        list.sort((o1, o2) -> {
            if (o1[0] != o2[0]) return o1[0] - o2[0];
            else return o1[1] - o2[1];
        });
        return list;
    }
}
