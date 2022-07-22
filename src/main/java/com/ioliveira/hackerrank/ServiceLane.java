package com.ioliveira.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ServiceLane {

    //https://www.hackerrank.com/challenges/service-lane/

    public static List<Integer> serviceLane(int n, List<List<Integer>> cases, List<Integer> width) {

        List<Integer> result = new ArrayList<>();

        for (final List<Integer> range : cases) {
            result.add(width.subList(range.get(0), range.get(1) + 1).stream().min((Integer::compareTo)).orElse(null));
        }

        return result;
    }

    public static void main(String[] args) {
        List<List<Integer>> cases = new ArrayList<>();
        cases.add(Arrays.asList(0, 3));
        cases.add(Arrays.asList(4, 6));
        cases.add(Arrays.asList(6, 7));
        cases.add(Arrays.asList(3, 5));
        cases.add(Arrays.asList(0, 7));

        System.out.println(serviceLane(8, cases, Arrays.asList(2, 3, 1, 2, 3, 2, 3, 3)));
    }
}
