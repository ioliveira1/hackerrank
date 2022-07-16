package com.ioliveira.hackerrank;

public class HackerRankinaString {

    //https://www.hackerrank.com/challenges/hackerrank-in-a-string/

    public static String hackerrankInString(String s) {
        final char[] chars = "hackerrank".toCharArray();
        int i = 0;

        for (char c : s.toCharArray()) {
            if (c == chars[i]) {
                i++;
            }
            if (i == 10) {
                return "YES";
            }
        }

        return "NO";
    }

    public static void main(String[] args) {
        System.out.println(hackerrankInString("rhbaasdndfsdskgbfefdbrsdfhuyatrjtcrtyytktjjt"));
    }
}
