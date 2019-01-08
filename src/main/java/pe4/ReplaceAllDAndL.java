package main.java.pe4;

class ReplaceAllDAndL {
    String replaceAllDAndL(String string) {
        if (string == null || string.isEmpty()) {
            System.out.println("String is null or empty");
            return "";
        }
        return string.replaceAll("d", "f").replaceAll("l", "t");
    }
}
