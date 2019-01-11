package com.stackroute.main.java.pe1.problem1;

class DigitAdder {
    /**
     * This function add the digits of a number
     * @param number - a long number
     * @return Sum of the digits of the number
     */
    Long addDigits(Long number) {
        Long reminder;
        Long sumOfNumbers = 0L;
        for (int i = 0; i <= number; i++) {
            reminder = number % 10;
            if (reminder % 2 == 0) {
                sumOfNumbers += reminder;
            }
            number = number / 10;
        }
        return sumOfNumbers;
    }
}
