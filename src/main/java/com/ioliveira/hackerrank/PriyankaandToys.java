package com.ioliveira.hackerrank;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PriyankaandToys {

    //https://www.hackerrank.com/challenges/priyanka-and-toys/

    public static int toys(List<Integer> w) {
        Collections.sort(w);

        int container = 1;
        int limit = w.get(0) + 4;

        for (int weight : w) {
            if (weight > limit) {
                limit = weight + 4;
                container++;
            }
        }

        return container;
    }

    public static void main(String[] args) {
        System.out.println(toys(Arrays.asList(16, 18, 10, 13, 2, 9, 17, 17, 0, 19)));
    }
}
