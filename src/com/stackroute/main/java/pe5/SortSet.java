package com.stackroute.main.java.pe5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
/*
* Write a program to implement set interface which sorts the given randomly ordered names in
ascending order. Convert the sorted set in to an array list
* */
public class SortSet implements Comparator<String> {
    /**
     * Converts a set to sorted list
     * @param setOfNames
     * @return
     */
    List<String> getSetToSortedList(Set<String> setOfNames) {
        List<String> unOrderedList = new ArrayList<>(setOfNames);
        unOrderedList.sort(new SortSet());
        return unOrderedList;
    }

    @Override
    public int compare(String firstString, String secondString) {
        if (firstString.compareTo(secondString) < 0) {
            return -1;
        } else if (firstString.compareTo(secondString) > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
