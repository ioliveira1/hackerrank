package com.ioliveira.hackerrank;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindtheMedian {

    //https://www.hackerrank.com/challenges/find-the-median/

    public static int findMedian(List<Integer> arr) {
        return arr.stream().sorted().collect(Collectors.toList()).get(arr.size() / 2);
    }

    public static void main(String[] args) {
        System.out.println(findMedian(Arrays.asList(0, 1, 2, 4, 6, 5, 3)));
    }
}
