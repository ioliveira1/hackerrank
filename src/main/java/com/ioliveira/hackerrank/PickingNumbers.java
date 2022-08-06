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
    }
}
