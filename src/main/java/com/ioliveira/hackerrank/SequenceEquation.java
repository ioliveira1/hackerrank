package com.ioliveira.hackerrank;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SequenceEquation {

    //https://www.hackerrank.com/challenges/permutation-equation/

    public static List<Integer> permutationEquation(List<Integer> p) {

        List<Integer> result = new ArrayList<>();

        for (int i = 1; i <= p.size(); i++) {
            for (int j = 0; j < p.size(); j++) {
                if (p.get(j) == i) {
                    result.add(p.indexOf(j + 1) + 1);
                    break;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(permutationEquation(Arrays.asList(4, 3, 5, 1, 2)));
    }
}
