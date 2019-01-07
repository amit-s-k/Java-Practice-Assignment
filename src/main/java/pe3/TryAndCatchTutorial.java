package main.java.pe3;

public class TryAndCatchTutorial {
    public static void main(String[] args) {
        String message = "You naughty developer ;) ";
        try {
            throw new IllegalArgumentException(message);

        } catch (Exception e) {
            System.out.println(message);

        } finally {
            System.out.println("We'll stay forever this way :P ");
        }
    }
}
