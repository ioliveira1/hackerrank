package com.ioliveira.hackerrank;


public class AppendandDelete {

    //https://www.hackerrank.com/challenges/append-and-delete/

    public static String appendAndDelete(String s, String t, int k) {
        StringBuilder str = new StringBuilder(s);

        if (!str.toString().equals(t)) {
            for (int i = 0; i < k; i++) {
                if (t.contains(str) && str.toString().equals(t.substring(0, str.length()))) {
                    if (str.length() <= 1 && k - i > t.length()) {
                        return "Yes";
                    }
                    if (str.length() == t.length()) {
                        str.append(t.charAt(str.length() - 1));
                    } else {
                        str.append(t.charAt(str.length()));
                    }
                } else {
                    str.deleteCharAt(str.length() - 1);
                }
            }
        }

        if (str.toString().equals(t) || s.equals(t)) {
            return "Yes";
        }

        return "No";
    }

    public static void main(String[] args) {
        System.out.println(appendAndDelete("aaa", "a", 5));
    }
}
