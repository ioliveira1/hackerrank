package com.ioliveira.hackerrank;

public class StrangeCounter {

    //https://www.hackerrank.com/challenges/strange-code/

    public static long strangeCounter(long tIme) {
        long time = 1;
        long value = 3;

        while (time <= tIme) {
            time = time + value;
            value = time + 2;
        }

        return time - tIme;
    }

    public static void main(String[] args) {
        System.out.println(strangeCounter(27));
    }
}
