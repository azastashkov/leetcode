package easy._1100_1199._1154;

public class Solution {
    public int dayOfYear(String date) {
        final int[] days = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8));

        int total = 0;
        for (int i = 0; i < month - 1; i++) {
            total += days[i];
        }

        if (month > 2 && isLeapYear(year)) {
            total++;
        }

        return total + day;
    }

    private static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else {
            return year % 100 != 0;
        }
    }
}