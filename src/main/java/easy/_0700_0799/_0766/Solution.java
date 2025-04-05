package easy._0700_0799._0766;

public class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int w = matrix[0].length;
        int h = matrix.length;

        for (int r = 1; r < h; r++) {
            for (int c = 1; c < w; c++) {
                if (matrix[r - 1][c - 1] != matrix[r][c]) {
                    return false;
                }
            }
        }

        return true;
    }
}
