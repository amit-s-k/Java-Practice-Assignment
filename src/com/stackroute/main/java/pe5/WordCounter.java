package com.stackroute.main.java.pe5;

import java.util.HashMap;
import java.util.Map;
/*
* Write a program to find the number of counts in the following String . Store the output in
Map< String ,Integer> as key value pair.
Input : String str = “one one -one___two,
* */
class WordCounter {
    /**
     * Finds the frequency of strings one tow and three
     * @return Returns a map
     */
    Map<String, Integer> countOfWords() {
        int countOfOne = getCount("one");
        int countOfTwo = getCount("two");
        int countOfThree = getCount("three");
        Map<String, Integer> stringIntegerMap = new HashMap<>();
        stringIntegerMap.put("one", countOfOne);
        stringIntegerMap.put("two", countOfTwo);
        stringIntegerMap.put("three", countOfThree);
        return stringIntegerMap;
    }

    /**
     * Finds the number of occurances of a given word in the given sentence
     * @param word
     * @return Returns the count
     */
    private int getCount(String word) {
        String sentence = "one one -one___two,,three,one @three*one?two";
        return (sentence.length() - sentence.replaceAll(word, "").length()) / word.length();
    }
}
