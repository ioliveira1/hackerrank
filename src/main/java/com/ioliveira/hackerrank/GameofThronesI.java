package com.ioliveira.hackerrank;

import java.util.Map;
import java.util.stream.Collectors;

public class GameofThronesI {

    //https://www.hackerrank.com/challenges/game-of-thrones/

    public static String gameOfThrones(String s) {
        Map<Character, Long> mapChars = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(character -> character, Collectors.counting()));

        int count = 0;
        for (long charFrequency : mapChars.values()) {
            if (charFrequency % 2 != 0) {
                count++;
            }
            if (count == 2) {
                return "NO";
            }
        }

        return "YES";
    }

    public static void main(String[] args) {
        System.out.println(gameOfThrones("bbbaaa"));
    }

}
