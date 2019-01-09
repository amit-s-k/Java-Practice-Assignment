package main.java.pe5;

import java.util.HashMap;
import java.util.Map;

class WordCounter {
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

    private int getCount(String word) {
        String sentence = "one one -one___two,,three,one @three*one?two";
        return (sentence.length() - sentence.replaceAll(word, "").length()) / word.length();
    }
}
