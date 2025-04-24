package easy._1600_1699._1637;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        Arrays.sort(points, Comparator.comparingInt(a -> a[0]));

        int max = 0;
        for (int i = 0; i < points.length - 1; ++i) {
            max = Math.max(max, points[i + 1][0] - points[i][0]);
        }

        return max;
    }
}