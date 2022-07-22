package com.ioliveira.hackerrank;

public class UtopianTree {

    //https://www.hackerrank.com/challenges/utopian-tree/

    public static int utopianTree(int n) {
        int h = 1;
        if (n == 0) {
            return h;
        }

        for (int i = 1; i <= n; i++) {
            h = i % 2 != 0 ? h * 2 : h + 1;
        }

        return h;
    }

    public static void main(String[] args) {
        System.out.println(utopianTree(5));
    }
}
