package com.stackroute.main.java.pe1.problem7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
* Write a program which accepts a number as input from user and perform the following:
a. sort the number in non-increasing order
b. after sorting sum all the even numbers, the sum should be greater than 15 .
c. if sum is more than 15,then print output as true or false.
* */
public class SortedSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        SortedSum sortedSum = new SortedSum();
        sortedSum.sortAndSumDigits(bufferedReader.readLine());
    }

    /**
     * Sorts the digits of a number in non-increasing order and prints the sum of the even digits
     * @param numberString
     */
    void sortAndSumDigits(String numberString) {
        String[] characterList = numberString.split("");
        List<Integer> integerList = new ArrayList<>();
        for (String s : characterList) {
            integerList.add(Integer.parseInt(s));
        }
        Collections.sort(integerList, Collections.reverseOrder());
        int sum = 0;

        for (Integer integer : integerList) {
            if (integer % 2 == 0) {
                sum += integer;
            }
        }

        for (Integer integer : integerList) {
            System.out.println("Sorted number in non-increasing order :" + integer);
        }
        System.out.println("Sum of even numbers: " + sum);

        if (sum > 15) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
