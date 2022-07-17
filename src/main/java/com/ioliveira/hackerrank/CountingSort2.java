package com.ioliveira.hackerrank;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountingSort2 {

    //https://www.hackerrank.com/challenges/countingsort2/

    public static List<Integer> countingSort(List<Integer> arr) {
        return arr.stream().sorted().collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println(countingSort(Arrays.asList(1, 1, 3, 2, 1)));
    }
}
