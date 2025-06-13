package easy._2600_2699._2639;

public class Solution {
    public int[] findColumnWidth(int[][] grid) {
        int nColumns = grid[0].length;
        int[] columnWidth = new int[nColumns];
        for (int c = 0; c < nColumns; c++) {
            int maxColumnWidth = 0;
            for (int[] ints : grid) {
                maxColumnWidth = Math.max(maxColumnWidth, String.valueOf(ints[c]).length());
            }
            columnWidth[c] = maxColumnWidth;
        }

        return columnWidth;
    }
}