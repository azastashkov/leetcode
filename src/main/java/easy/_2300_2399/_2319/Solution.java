package easy._2300_2399._2319;

public class Solution {
    public boolean checkXMatrix(int[][] grid) {
        int n = grid.length;
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                if (r == c || (c == n - r - 1 && r == n - c - 1)) {
                    if (grid[r][c] == 0) {
                        return false;
                    }
                } else {
                    if (grid[r][c] != 0) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}