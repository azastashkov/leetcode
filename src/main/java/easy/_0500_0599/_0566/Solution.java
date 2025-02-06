package easy._0500_0599._0566;

public class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;

        if (m * n != r * c) {
            return mat;
        }

        int[][] out = new int[r][c];
        for (int i = 0; i < m * n; ++i) {
            out[i / c][i % c] = mat[i / n][i % n];
        }

        return out;
    }
}
