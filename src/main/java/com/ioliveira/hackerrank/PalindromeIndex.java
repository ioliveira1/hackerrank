package com.ioliveira.hackerrank;

public class PalindromeIndex {

    //https://www.hackerrank.com/challenges/palindrome-index/

    public static int palindromeIndex(String s) {
        final int size = s.length();
        int end = size - 1;

        for (int start = 0; start <= size / 2 - 1; start++, end--) {
            if (s.charAt(start) != s.charAt(end)) {
                return new StringBuilder(s)
                        .deleteCharAt(start)
                        .toString()
                        .equals(new StringBuilder(s)
                                .deleteCharAt(start)
                                .reverse()
                                .toString()) ? start : end;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(palindromeIndex("madasm"));
    }
}
