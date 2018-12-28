package problem5;

import java.util.Scanner;

public class IntegerAdder {

    public static void main(String[] args) {
        IntegerAdder integerAdder = new IntegerAdder();
        System.out.println(integerAdder.addIntegers());

    }

    public int addIntegers() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (scanner.hasNextInt()) {
            sum += scanner.nextInt();
        }
        return sum;
    }
}
