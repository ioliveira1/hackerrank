package com.ioliveira.hackerrank;

import java.util.Arrays;
import java.util.List;

public class InsertionSortPart1 {

    //https://www.hackerrank.com/challenges/insertionsort1/

    public static void insertionSort1(int n, List<Integer> arr) {
        final int start = arr.size() - 2;
        final Integer unsortedNumber = arr.get(arr.size() - 1);
        for (int i = start; i >= 0; i--) {
            if (unsortedNumber < arr.get(i)) {
                arr.set(i + 1, arr.get(i));
                print(arr);
            } else {
                arr.set(i + 1, unsortedNumber);
                print(arr);
                break;
            }
        }

        if (unsortedNumber == 1) {
            arr.set(0, unsortedNumber);
            print(arr);
        }

    }

    public static void print(List<Integer> list) {
        list.forEach(value -> System.out.print(value + " "));
        System.out.println();
    }

    public static void main(String[] args) {
        insertionSort1(14, Arrays.asList(2, 3, 4, 5, 6, 7, 8, 9, 10, 1));
    }
}
