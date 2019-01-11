package com.stackroute.main.java.pe3;
/*
* Write a java program to calculate first and last date of a week.
* */
class FirstAndLastDateOfWeek {
    /**
     * Finds the first day of the week
     * @param weekNumber
     * @param month
     * @param year
     * @return returns Date in DD/MM/YYYY format
     */
    String getFirstDayOfWeek(int weekNumber, int month, int year) {
        int firstDay = (weekNumber - 1) * 7 + 1;
        return String.format("%s / %s / %s", firstDay, month, year);
    }
    /**
     * Finds the last day of the week
     * @param weekNumber
     * @param month
     * @param year
     * @return returns Date in DD/MM/YYYY format
     */
    String getLastDayOfWeek(int weekNumber, int month, int year) {
        int firstDay = (weekNumber - 1) * 7 + 1;
        int lastDay = firstDay + 6;
        return String.format("%s / %s / %s", lastDay, month, year);
    }
}
