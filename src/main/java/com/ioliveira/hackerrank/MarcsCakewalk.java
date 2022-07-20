package com.ioliveira.hackerrank;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MarcsCakewalk {

    //https://www.hackerrank.com/challenges/marcs-cakewalk/

    public static long marcsCakewalk(List<Integer> calorie) {
        long miles = 0;

        calorie.sort(Collections.reverseOrder());

        for (int i = 0; i < calorie.size(); i++) {
            miles += Math.pow(2, i) * calorie.get(i);
        }

        return miles;
    }

    public static void main(String[] args) {
        System.out.println(marcsCakewalk(Arrays.asList(7, 4, 9, 6)));
    }
}
