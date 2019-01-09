package main.java.pe5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

public class SortSet implements Comparator<String> {

    List<String> getSetToSortedList(Set<String> setOfNames) {
        List<String> unOrderedList = new ArrayList<>(setOfNames);
        unOrderedList.sort(new SortSet());
        return unOrderedList;
    }

    @Override
    public int compare(String o1, String o2) {
        if (o1.compareTo(o2) < 0) {
            return -1;
        } else if (o1.compareTo(o2) > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}
