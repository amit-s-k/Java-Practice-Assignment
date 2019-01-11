package com.stackroute.main.java.pe4;

import java.util.Arrays;
/*
* Write a program that sets up a String variable containing a paragraph of text of your choice.
a. Extract the words from the text and sort them into alphabetical order.
b. Display the sorted list of words.

* */
class SortStringsAlphabetically {
    /**
     * Sorts words in a sentence lexicographically
     * @param paragraph
     * @return Returns sorted sentence
     */
    String sortAlphabetically(String paragraph) {
        if (paragraph == null || paragraph.isEmpty()) {
            System.out.println("Paragraph is null or empty");
            return "";
        }
        return Arrays.stream(paragraph.split(" ")).sorted().reduce((a, b) -> a.concat(" ").concat(b)).get();
    }
}
