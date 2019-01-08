package main.java.pe4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class FrequencyOfWord {

    Index getStartIndexAndEndIndex(String sentence, String word) {
        int startIndex = 0;
        int lastIndex;
        List<Integer> startIndices = new ArrayList<>();
        List<Integer> lastIndices = new ArrayList<>();
        while (startIndex != -1) {
            startIndex = sentence.indexOf(word, startIndex);
            lastIndex = startIndex + word.length() - 1;
            if (startIndex == -1) {
                break;
            }
            startIndices.add(startIndex);
            lastIndices.add(lastIndex);
            startIndex += word.length();
        }
        Map<String, List<Integer>> indices = new HashMap<>();
        indices.put("startindex", startIndices);
        indices.put("endindex", lastIndices);
        return new Index(indices);
    }
}
