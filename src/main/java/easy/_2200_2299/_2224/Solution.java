package easy._2200_2299._2224;

import java.util.Arrays;

public class Solution {
    public int convertTime(String current, String correct) {
        int currentHours = Integer.parseInt(current.substring(0, 2));
        int currentMinutes = Integer.parseInt(current.substring(3));
        int currentInMinutes = currentHours * 60 + currentMinutes;

        int correctHours = Integer.parseInt(correct.substring(0, 2));
        int correctMinutes = Integer.parseInt(correct.substring(3));
        int correctInMinutes = correctHours * 60 + correctMinutes;

        int minutesDiff = correctInMinutes - currentInMinutes;

        int minOps = 0;
        for (int i : Arrays.asList(60, 15, 5, 1)) {
            minOps += minutesDiff / i;
            minutesDiff %= i;
        }

        return minOps;
    }
}