package com.ioliveira.hackerrank;

public class TheLoveLetterMystery {

    //https://www.hackerrank.com/challenges/the-love-letter-mystery/

    public static int theLoveLetterMystery(String s) {
        final String reverse = new StringBuilder(s).reverse().toString();
        if (s.equals(reverse)) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i <= s.length() / 2 - 1; i++) {
            count = count + Math.abs(reverse.codePointAt(i) - s.codePointAt(i));
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(theLoveLetterMystery("lmnop"));
    }
}
