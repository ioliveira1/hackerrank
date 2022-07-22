package com.ioliveira.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CavityMap {

    //https://www.hackerrank.com/challenges/cavity-map/

    public static List<String> cavityMap(List<String> grid) {

        if (grid.get(0).length() == 1) {
            return Collections.singletonList(grid.stream().max(String::compareTo).orElse(null));
        }

        List<String> result = new ArrayList<>();
        StringBuilder builder = new StringBuilder();
        result.add(grid.get(0));

        for (int i = 1; i < grid.size() - 1; i++) {
            builder.append(grid.get(i).charAt(0));
            for (int j = 1; j < grid.size() - 1; j++) {

                final int cell = Integer.parseInt(grid.get(i).substring(j, j + 1));
                final int left = Integer.parseInt(grid.get(i).substring(j - 1, j));
                final int right = Integer.parseInt(grid.get(i).substring(j + 1, j + 2));
                final int up = Integer.parseInt(grid.get(i - 1).substring(j, j + 1));
                final int down = Integer.parseInt(grid.get(i + 1).substring(j, j + 1));

                if (cell > left && cell > right && cell > up && cell > down) {
                    builder.append("X");
                } else {
                    builder.append(cell);
                }
            }
            builder.append(grid.get(i).charAt(grid.size() - 1));
            result.add(builder.toString());
            builder.setLength(0);
        }
        result.add(grid.get(grid.size() - 1));

        return result;
    }

    public static void main(String[] args) {
        System.out.println(cavityMap(Arrays.asList("1", "9")));
    }
}
