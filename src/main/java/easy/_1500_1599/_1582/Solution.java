package easy._1500_1599._1582;

public class Solution {
    public int numSpecial(int[][] mat) {
        int h = mat.length, w = mat[0].length;
        int[] rows = new int[h];
        int[] cols = new int[w];

        for (int r = 0; r < h; r++) {
            for (int c = 0; c < w; c++) {
                rows[r] += mat[r][c];
                cols[c] += mat[r][c];
            }
        }

        int num = 0;
        for (int r = 0; r < h; r++) {
            for (int c = 0; c < w; c++) {
                if (mat[r][c] == 1 && rows[r] == 1 && cols[c] == 1) {
                    num++;
                }
            }
        }

        return num;
    }
}