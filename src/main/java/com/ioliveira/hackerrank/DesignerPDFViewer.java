package com.ioliveira.hackerrank;


import java.util.Arrays;
import java.util.List;

public class DesignerPDFViewer {

    //https://www.hackerrank.com/challenges/designer-pdf-viewer/

    public static int designerPdfViewer(List<Integer> h, String word) {
        int max = 0;
        for (int i = 0; i < word.length(); i++) {
            max = max < h.get(word.charAt(i) - 97) ? h.get(word.charAt(i) - 97) : max;
        }
        return max * word.length();
    }

    public static void main(String[] args) {
        System.out.println(designerPdfViewer(Arrays.asList(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6), "zaba"));
    }
}
