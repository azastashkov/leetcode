package easy._1300_1399._1351;

public class Solution {
    public int countNegatives(int[][] grid) {
        int h = grid.length, w = grid[0].length;
        int count = 0;
        for (int r = h - 1, c = 0; r >= 0 && c < w;) {
            if (grid[r][c] < 0) {
                count += w - c;
                r--;
            } else {
                c++;
            }
        }

        return count;
    }
}