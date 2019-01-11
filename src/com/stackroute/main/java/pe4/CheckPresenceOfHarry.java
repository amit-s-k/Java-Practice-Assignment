package com.stackroute.main.java.pe4;
/*
* Write a program with the implementation of Regular Expression to find the presence of the name Harry in a string.
* */
class CheckPresenceOfHarry {
    /**
     * Checks if harry is present in the given sentence
     * @param sentence
     * @return Returns true if harry is present
     */
    boolean checkIfHarryIsPresent(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            System.out.println("Sentence is null or Empty");
            return false;
        }
        return sentence.contains("Harry");
    }
}
