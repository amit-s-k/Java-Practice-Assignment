package main.java.pe3;

public class ThrowingExceptions {
    public static void main(String[] args) {
        int[] arr = new int[2];
        try {
            System.out.println("Going beyond limits! " + arr[3]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        try {
            int[] a = new int[-1];
        } catch (NegativeArraySizeException e) {
            System.out.println(e.getMessage());
        }
        try {
            String item = null;
            item.trim();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
