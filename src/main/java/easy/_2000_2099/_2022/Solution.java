package easy._2000_2099._2022;

public class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        if (m * n != original.length) {
            return new int[0][0];
        }

        int[][] matrix = new int[m][n];
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                matrix[r][c] = original[r * n + c];
            }
        }

        return matrix;
    }
}