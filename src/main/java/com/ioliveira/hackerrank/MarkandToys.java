package com.ioliveira.hackerrank;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MarkandToys {

    //https://www.hackerrank.com/challenges/mark-and-toys/

    public static int maximumToys(List<Integer> prices, int k) {
        int toys = 0;
        Collections.sort(prices);

        for (Integer price : prices) {
            if (k >= price) {
                k -= price;
                toys++;
            } else {
                break;
            }
        }

        return toys;
    }

    public static void main(String[] args) {
        System.out.println(maximumToys(Arrays.asList(1, 12, 5, 111, 200, 1000, 10), 50));
    }
}
