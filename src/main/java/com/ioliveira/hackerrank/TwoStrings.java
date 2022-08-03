package com.ioliveira.hackerrank;

import java.util.Set;
import java.util.stream.Collectors;

public class TwoStrings {

    //https://www.hackerrank.com/challenges/two-strings/

    public static String twoStrings(String s1, String s2) {
        final Set<Character> setS1 = s1.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());
        final Set<Character> setS2 = s2.chars().mapToObj(c -> (char) c).collect(Collectors.toSet());

        return setS1.removeAll(setS2) ? "YES" : "NO";
    }

    public static void main(String[] args) {
        System.out.println(twoStrings("hihi", "woooorld"));
    }

}
