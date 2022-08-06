package com.ioliveira.hackerrank;

public class ModifiedKaprekarNumbers {

    //https://www.hackerrank.com/challenges/kaprekar-numbers/

    public static void kaprekarNumbers(int p, int q) {

        StringBuilder result = new StringBuilder();

        for (int i = p; i <= q; i++) {
            final String sqrt = String.valueOf((long) Math.pow(i, 2));

            if (sqrt.length() == 1) {
                if (sqrt.equals("1")) {
                    result.append("1");
                }
                continue;
            }

            final long l2 = Long.parseLong(sqrt.substring(0, sqrt.length() / 2));
            final long r2 = Long.parseLong(sqrt.substring(sqrt.length() / 2));

            if ((l2 + r2 == i) && (r2 != 0)) {
                result.append(" ").append(i);
            }

        }

        System.out.println(result.length() > 0 ? result.toString().trim() : "INVALID RANGE");
    }

    public static void main(String[] args) {
        kaprekarNumbers(100, 300);
    }
}