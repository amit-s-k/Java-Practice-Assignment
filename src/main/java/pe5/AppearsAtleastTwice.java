package main.java.pe5;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

class AppearsAtleastTwice {
    Map<String, Boolean> getCountOfWords(String[] arr) {
        Map<String, AtomicInteger> stringIntegerMap = new HashMap<>();
        for (String s : arr) {
            stringIntegerMap.putIfAbsent(s, new AtomicInteger(0));
            stringIntegerMap.get(s).getAndIncrement();
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
