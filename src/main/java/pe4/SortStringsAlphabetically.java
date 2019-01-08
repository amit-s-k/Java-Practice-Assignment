package main.java.pe4;

import java.util.Arrays;

class SortStringsAlphabetically {
    String sortAlphabetically(String paragraph) {
        if (paragraph == null || paragraph.isEmpty()) {
            System.out.println("Paragraph is null or empty");
            return "";
        }
        return Arrays.stream(paragraph.split(" ")).sorted().reduce((a, b) -> a.concat(" ").concat(b)).get();
    }
}
