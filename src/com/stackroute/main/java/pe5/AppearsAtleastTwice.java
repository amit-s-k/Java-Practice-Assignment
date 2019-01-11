package com.stackroute.main.java.pe5;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
/*
* Write a program where an array of strings is input and output is a Map< String ,boolean> where
each different string is a key and its value is true if that string appears 2 or more times in the array
Input : String arr[] = {“a”,”b”,”c”,”d”,”a”,”c”,”c”}
Output - {“a” : true,”b” :false ,”c” :true,”d” : false}
* */
class AppearsAtleastTwice {
    /**
     * Finds whether a given word appears atleast twice
     * @param arr array of strings
     * @return Returns a map with key as word and value as true if the word appears atleast twice
     */
    Map<String, Boolean> getCountOfWords(String[] arr) {
        Map<String, AtomicInteger> stringIntegerMap = new HashMap<>();
        for (String string : arr) {
            stringIntegerMap.putIfAbsent(string, new AtomicInteger(0));
            stringIntegerMap.get(string).getAndIncrement();
        }
        Map<String, Boolean> stringBooleanMap = new HashMap<>();
        stringIntegerMap.forEach((key, value) -> {
            if (value.intValue() >= 2) {
                stringBooleanMap.put(key, true);
            } else {
                stringBooleanMap.put(key, false);
            }
        });
        return stringBooleanMap;
    }
}
