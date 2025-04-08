package easy._0800_0899._0867;

public class Solution {
    public int[][] transpose(int[][] matrix) {
        int w = matrix[0].length;
        int h = matrix.length;
        int[][] transposed = new int[w][h];
        for (int r = 0; r < h; r++) {
            for (int c = 0; c < w; c++) {
                transposed[c][r] = matrix[r][c];
            }
        }

        return transposed;
    }
}