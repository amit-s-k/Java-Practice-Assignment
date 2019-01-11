package com.stackroute.main.java.pe4;

import java.util.Arrays;
/*
* Write a program to transpose the given string.
* */
class TransposeOfString {
    /**
     * Finds the transpose of a string. Transpose of a string is the mirror image of a string
     * @param string
     * @return Returns transposed string
     */
    String getTransposeOfString(String string) {
        return Arrays.stream(string.split(" ")).map(s -> new StringBuilder(s).reverse().toString()).reduce((a, b) -> a.concat(" ").concat(b)).get();
    }
}
