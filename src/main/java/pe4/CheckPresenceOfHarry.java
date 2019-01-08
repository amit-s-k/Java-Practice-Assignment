package main.java.pe4;

class CheckPresenceOfHarry {

    boolean checkIfHarryIsPresent(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            System.out.println("Sentence is null or Empty");
            return false;
        }
        return sentence.contains("Harry");
    }
}
