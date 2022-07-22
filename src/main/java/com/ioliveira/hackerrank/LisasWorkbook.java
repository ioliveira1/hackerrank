package com.ioliveira.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LisasWorkbook {

    //https://www.hackerrank.com/challenges/lisa-workbook/

    public static int workbook(int n, int k, List<Integer> arr) {
        int specialProblems = 0;

        List<List<Integer>> listPages = new ArrayList<>();

        for (int numberProblems : arr) {
            List<Integer> page = new ArrayList<>();
            for (int i = 1; i <= numberProblems; i++) {
                if (page.size() <= k) {
                    page.add(i - 1);
                }
                if (page.size() == k || i == numberProblems) {
                    listPages.add(page);
                    page = new ArrayList<>();
                }
            }
        }

        for (int i = 0; i < listPages.size(); i++) {
            if (listPages.get(i).contains(i)) {
                specialProblems++;
            }
            System.out.println("Teste");
        }

        return specialProblems;
    }

    public static void main(String[] args) {
        System.out.println(workbook(2, 3, Arrays.asList(4, 2)));
    }
}
