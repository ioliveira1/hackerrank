package com.ioliveira.hackerrank;

public class MakingAnagrams {

    //https://www.hackerrank.com/challenges/making-anagrams/

    public static int makingAnagrams(String s1, String s2) {
        StringBuilder smallest = new StringBuilder(s2);
        StringBuilder biggest = new StringBuilder(s1);

        if (s1.length() < s2.length()) {
            smallest = new StringBuilder(s1);
            biggest = new StringBuilder(s2);
        }

        for (char c : smallest.toString().toCharArray()) {
            final String charValue = String.valueOf(c);
            if (biggest.toString().contains(charValue)) {
                smallest.deleteCharAt(smallest.indexOf(charValue));
                biggest.deleteCharAt(biggest.indexOf(charValue));
            }
        }

        return smallest.length() + biggest.length();
    }

    public static void main(String[] args) {
        System.out.println(makingAnagrams("abc", "amnop"));
    }

}
