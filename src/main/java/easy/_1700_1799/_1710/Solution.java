package easy._1700_1799._1710;

import java.util.Arrays;

public class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);

        int max = 0;
        for (int[] t : boxTypes) {
            int numberOfBoxes = t[0], numberOfUnitsPerBox = t[1];
            max += numberOfUnitsPerBox * Math.min(truckSize, numberOfBoxes);
            truckSize -= numberOfBoxes;
            if (truckSize <= 0) {
                break;
            }
        }

        return max;
    }
}