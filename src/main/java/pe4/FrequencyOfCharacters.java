package main.java.pe4;

class FrequencyOfCharacters {
    int numberOfOccurances(String string, String ch) {
        if (string == null || ch == null) {
            System.out.println("Invalid Character");
            return 0;
        }
        return string.length() - string.replaceAll(ch, "").length();
    }
}
