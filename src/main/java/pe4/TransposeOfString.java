package main.java.pe4;

import java.util.Arrays;

class TransposeOfString {
    String getTransposeOfString(String string) {
        return Arrays.stream(string.split(" ")).map(s -> new StringBuilder(s).reverse().toString()).reduce((a, b) -> a.concat(" ").concat(b)).get();
    }
}
