package problem1;

public class DigitAdder {

    public Long addDigits(Long number) {
        Long rem;
        Long sum = 0L;
        for (int i = 0; i <= number; i++) {
            rem = number % 10;
            if (rem % 2 == 0) {
                sum += rem;
            }
            number = number / 10;
        }
        return sum;
    }
}
