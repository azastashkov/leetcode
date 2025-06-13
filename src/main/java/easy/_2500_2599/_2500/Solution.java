package easy._2500_2599._2500;

import java.util.Arrays;

public class Solution {
    public int deleteGreatestValue(int[][] grid) {
        for (var row : grid) {
            Arrays.sort(row);
        }

        int ans = 0, nColumns = grid[0].length;
        for (int c = 0; c < nColumns; c++) {
            int t = 0;
            for (int[] ints : grid) {
                t = Math.max(t, ints[c]);
            }
            ans += t;
        }

        return ans;
    }
}