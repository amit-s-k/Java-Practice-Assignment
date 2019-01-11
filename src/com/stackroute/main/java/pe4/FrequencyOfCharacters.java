package com.stackroute.main.java.pe4;
/*
* Write a java program to count the total number of occurrences of a given character in a string without using any loop?
* */
class FrequencyOfCharacters {
    /**
     * Finds the number of occurances in the given string
     * @param string
     * @param character
     * @return returns count of occurances
     */
    int numberOfOccurances(String string, String character) {
        if (string == null || character == null) {
            System.out.println("Invalid Character");
            return 0;
        }
        return string.length() - string.replaceAll(character, "").length();
    }
}
