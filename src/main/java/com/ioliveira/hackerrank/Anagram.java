package com.ioliveira.hackerrank;

public class Anagram {

    //https://www.hackerrank.com/challenges/anagram/

    public static int anagram(String s) {

        if (s.length() % 2 != 0) {
            return -1;
        }

        final String a = s.substring(0, s.length() / 2);
        final StringBuilder b = new StringBuilder(s.substring(s.length() / 2));

        for (char c : a.toCharArray()) {
            final String strChar = String.valueOf(c);
            if (b.toString().contains(strChar)) {
                b.deleteCharAt(b.indexOf(strChar));
            }
        }

        return b.length();
    }

    public static void main(String[] args) {
        System.out.println(anagram("xaxbbbxx"));
    }

}
