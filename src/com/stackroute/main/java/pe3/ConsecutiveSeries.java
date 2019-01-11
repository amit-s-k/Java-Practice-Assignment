package com.stackroute.main.java.pe3;

import java.util.Collections;
import java.util.List;
/*
*
* Write a program to compute the addition of two matrix, Read the number of rows and columns as input,
* also the values of each matrix
* */
class ConsecutiveSeries {
    /**
     * Checks whether a series is consecutive
     * @param series
     * @return Returns true if the series is consecutive
     */
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
