package com.ioliveira.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MissingNumbers {

    //https://www.hackerrank.com/challenges/missing-numbers/

    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        List<Integer> smallest = new ArrayList<>(brr);
        List<Integer> biggest = new ArrayList<>(arr);
        if (arr.size() < brr.size()) {
            smallest = new ArrayList<>(arr);
            biggest = new ArrayList<>(brr);
        }

        for (Integer integer : smallest) {
            biggest.remove(integer);
        }

        return biggest.stream().sorted().distinct().toList();
    }

    public static void main(String[] args) {
        final List<Integer> arr = Arrays.asList(203, 204, 205, 206, 207, 208, 203, 204, 205, 206);
        final List<Integer> brr = Arrays.asList(203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204);

        System.out.println(missingNumbers(arr, brr));
    }

}
