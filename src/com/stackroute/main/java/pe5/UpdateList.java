package com.stackroute.main.java.pe5;


import java.util.Collections;
import java.util.List;
/*
* Write a Java program to update specific array element by given element and empty the array list .
* */
class UpdateList {
    /**
     * Replaces an element in the list with the given element
     * @param inputList
     * @param elementToBeReplaced
     * @param replaceWith
     * @return Returns the updated list
     */
    List<String> updateList(List<String> inputList, String elementToBeReplaced, String replaceWith) {
        if (inputList.isEmpty() || inputList == null || !(inputList.contains(elementToBeReplaced)))
            return Collections.emptyList();
        inputList.set(inputList.indexOf(elementToBeReplaced), replaceWith);
        return inputList;
    }
}
