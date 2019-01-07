package main.java.pe3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveLowerCaseVowels {
    private static final List<Character> LOWERCASE_VOWELS = Arrays.asList('a', 'e', 'i', 'o', 'u');

    List<String> removeLowerCaseVowels(List<String> places) {
        List<String> result = new ArrayList<>();
        for (String item : places) {
            StringBuilder stringBuilder = new StringBuilder(item);
            for (int j = 0; j < stringBuilder.length(); ) {
                if (LOWERCASE_VOWELS.contains(stringBuilder.charAt(j))) {
                    stringBuilder.deleteCharAt(j);
                } else {
                    j += 1;
                }
            }
            result.add(stringBuilder.toString());
        }
        return result;
    }
}
