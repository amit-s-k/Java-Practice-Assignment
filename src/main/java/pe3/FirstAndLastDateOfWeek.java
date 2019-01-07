package main.java.pe3;

class FirstAndLastDateOfWeek {

    String getFirstDayOfWeek(int weekNumber, int month, int year) {
        int firstDay = (weekNumber - 1) * 7 + 1;
        return String.format("%s / %s / %s", firstDay, month, year);
    }

    String getLastDayOfWeek(int weekNumber, int month, int year) {
        int firstDay = (weekNumber - 1) * 7 + 1;
        int lastDay = firstDay + 6;
        return String.format("%s / %s / %s", lastDay, month, year);
    }
}
