package com.ioliveira.hackerrank;

import java.util.Arrays;
import java.util.List;

public class InsertionSortPart2 {

    //https://www.hackerrank.com/challenges/insertionsort2/

    public static void insertionSort2(int n, List<Integer> arr) {

        for (int i = 1; i < arr.size(); i++) {
            int auxI = 0;
            for (int j = i - 1; j >= 0; j--) {
                final Integer valueI = arr.get(i - auxI);
                final Integer valueJ = arr.get(j);
                if (arr.get(i - auxI) < arr.get(j)) {
                    arr.set(i - auxI, valueJ);
                    arr.set(j, valueI);
                    auxI++;
                }
            }
            print(arr);
        }

    }

    public static void print(List<Integer> list) {
        list.forEach(value -> System.out.print(value + " "));
        System.out.println();
    }

    public static void main(String[] args) {
        insertionSort2(14, Arrays.asList(1, 4, 3, 5, 6, 2));
    }
}
