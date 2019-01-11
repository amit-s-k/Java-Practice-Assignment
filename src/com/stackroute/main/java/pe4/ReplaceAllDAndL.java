package com.stackroute.main.java.pe4;
/*
* Write a program to replace all d with f and all l with t in the given String
* */
class ReplaceAllDAndL {
    /**
     * Replaces all D and L's in a string
     * @param string
     * @return Returns string without D and L's
     */
    String replaceAllDAndL(String string) {
        if (string == null || string.isEmpty()) {
            System.out.println("String is null or empty");
            return "";
        }
        return string.replaceAll("d", "f").replaceAll("l", "t");
    }
}
