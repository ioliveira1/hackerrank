package com.ioliveira.hackerrank;


public class JumpingontheCloudsRevisited {

    //https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited/

    static int jumpingOnClouds(int[] c, int k) {

        int energy = 100;
        final int size = c.length;
        int index = 0;

        do {
            if (c[index] == 0) {
                energy = energy - 1;
            } else {
                energy = energy - 1 - 2;
            }
            index = (index + k) % size;
        } while (index != 0);

        return energy;
    }

    public static void main(String[] args) {
        int[] c = {1, 1, 1, 0, 1, 1, 0, 0, 0, 0};
        System.out.println(jumpingOnClouds(c, 3));
    }
}
