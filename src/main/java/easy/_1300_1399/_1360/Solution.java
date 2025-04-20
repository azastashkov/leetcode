package easy._1300_1399._1360;

public class Solution {
    public int daysBetweenDates(String date1, String date2) {
        final int[] daysInMonths = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        int year1 = year(date1);
        int year2 = year(date2);

        int month1 = month(date1);
        int month2 = month(date2);

        int day1 = day(date1);
        int day2 = day(date2);

        return Math.abs(calcDays(year1, month1, day1, daysInMonths) - calcDays(year2, month2, day2, daysInMonths));
    }

    private int calcDays(int year, int month, int day, int[] daysInMonths) {
        int days = 0;
        for (int y = 2019; y < year; y++) {
            days += 365;
            if (java.time.Year.of(y).isLeap()) {
                days++;
            }
        }

        for (int m = 1; m < month; m++) {
            days += daysInMonths[m - 1];
            if (java.time.Year.of(year).isLeap()) {
                days++;
            }
        }

        return days + day;
    }

    private int year(String date) {
        return Integer.parseInt(date.substring(0, 4));
    }

    private int month(String date) {
        return Integer.parseInt(date.substring(5, 7));
    }

    private int day(String date) {
        return Integer.parseInt(date.substring(8));
    }
}