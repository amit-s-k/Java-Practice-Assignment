package problem9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReverseString {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String reversedString = bufferedReader.readLine();
        StringBuilder stringBuilder = new StringBuilder(reversedString);
        System.out.println(stringBuilder.reverse().toString());
    }
}
