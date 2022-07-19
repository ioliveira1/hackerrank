package com.ioliveira.hackerrank;


public class CaesarCipher {

    //https://www.hackerrank.com/challenges/caesar-cipher-1/

    public static String caesarCipher(String s, int k) {
        StringBuilder builder = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                int codePointStart = Character.isLowerCase(c) ? 97 : 65;
                builder.append((char) ((c + k - codePointStart) % 26 + codePointStart));
            } else {
                builder.append(c);
            }
        }

        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(caesarCipher("middle-Outz", 2));
    }
}
