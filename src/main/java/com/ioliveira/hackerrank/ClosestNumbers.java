package com.ioliveira.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ClosestNumbers {

    //https://www.hackerrank.com/challenges/closest-numbers/

    public static List<Integer> closestNumbers(List<Integer> arr) {
        final int size = arr.size();
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> differences = new HashMap<>();

        Collections.sort(arr);

        for (int i = 0; i < size - 1; i++) {
            differences.put(i, Math.abs(arr.get(i) - arr.get(i + 1)));
        }

        final LinkedHashMap<Integer, Integer> differencesAscendingOrder = differences
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (v1, v2) -> v1, LinkedHashMap::new));

        int aux = Integer.MAX_VALUE;
        for (int key : differencesAscendingOrder.keySet()) {
            if (differences.get(key) <= aux) {
                aux = differences.get(key);
                result.add(arr.get(key));
                result.add(arr.get(key + 1));
            } else {
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(closestNumbers(Arrays.asList(-20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854)));
        //System.out.println(closestNumbers(Arrays.asList(-20, -3916237, -357920, -3620601, 7374819, -7330761, 30, 6246457, -6461594, 266854, -520, -470)));
    }

}
