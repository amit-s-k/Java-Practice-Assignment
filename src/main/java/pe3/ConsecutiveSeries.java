package main.java.pe3;

import java.util.Collections;
import java.util.List;

class ConsecutiveSeries {
    boolean isSeriesConsecutive(List<Long> series) {
        if (series == null || series.isEmpty()) {
            System.out.println("Invalid Input");
            return false;
        }
        Collections.sort(series);
        for (int i = 0; i < series.size() - 1; i++) {
            if (Math.abs(series.get(i) - series.get(i + 1)) != 1L) {
                return false;
            }
        }
        return true;
    }
}
