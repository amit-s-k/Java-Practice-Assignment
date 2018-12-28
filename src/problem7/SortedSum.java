package problem7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedSum {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        SortedSum sortedSum = new SortedSum();
        sortedSum.sortAndSumDigits(bufferedReader.readLine());

    }

    public void sortAndSumDigits(String numberString) {
        String[] characterList = numberString.split("");
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < characterList.length; i++) {
            integerList.add(Integer.parseInt(characterList[i]));
        }
        Collections.sort(integerList, Collections.reverseOrder());
        int sum = 0;

        for (int i = 0; i < integerList.size(); i++) {
            Integer integer = integerList.get(i);
            if (integer % 2 == 0) {
                sum += integer;
            }
        }

        for (int i = 0; i < integerList.size(); i++) {
            System.out.println("Sorted number in non-increasing order :" + integerList.get(i));
        }
        System.out.println("Sum of even numbers: " + sum);

        if (sum > 15) {
            System.out.println(true);

        } else {
            System.out.println(false);

        }
    }

}
