package main.java.pe5;


import java.util.Collections;
import java.util.List;

class UpdateList {
    List<String> updateList(List<String> inputList, String elementToBeReplaced, String replaceWith) {
        if (inputList.isEmpty() || inputList == null || !(inputList.contains(elementToBeReplaced)))
            return Collections.emptyList();
        inputList.set(inputList.indexOf(elementToBeReplaced), replaceWith);
        return inputList;
    }
}
