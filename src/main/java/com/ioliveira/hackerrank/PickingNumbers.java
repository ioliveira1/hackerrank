package com.ioliveira.hackerrank;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PickingNumbers {

    //https://www.hackerrank.com/challenges/picking-numbers/

    public static int pickingNumbers(List<Integer> a) {

        Map<Integer, Integer> frequencies = new HashMap<>();
        int result = 0;

        for (int number : a) {
            frequencies.put(number, Collections.frequency(a, number));
        }

        for (Map.Entry<Integer, Integer> frequency : frequencies.entrySet()) {
            final int keyAbove = frequencies.get(frequency.getKey() + 1) != null
                    ? frequencies.get(frequency.getKey() + 1)
                    : 0;

            final int keyBelow = frequencies.get(frequency.getKey() - 1) != null
                    ? frequencies.get(frequency.getKey() - 1)
                    : 0;

            final Integer biggest = Math.max(keyAbove, keyBelow);

            if (frequency.getValue() + biggest > result) {
                result = frequency.getValue() + biggest;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(pickingNumbers(Arrays.asList(1, 1, 2, 2, 4, 4, 5, 5, 5)));
        //System.out.println(pickingNumbers(Arrays.asList(7, 12, 13, 19, 17, 7, 3, 18, 9, 18, 13, 12, 3, 13, 7, 9, 18, 9, 18, 9, 13, 18, 13, 13, 18, 18, 17, 17, 13, 3, 12, 13, 19, 17, 19, 12, 18, 13, 7, 3, 3, 12, 7, 13, 7, 3, 17, 9, 13, 13, 13, 12, 18, 18, 9, 7, 19, 17, 13, 18, 19, 9, 18, 18, 18, 19, 17, 7, 12, 3, 13, 19, 12, 3, 9, 17, 13, 19, 12, 18, 13, 18, 18, 18, 17, 13, 3, 18, 19, 7, 12, 9, 18, 3, 13, 13, 9, 7)));
    }
}
