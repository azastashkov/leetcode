package easy._3000_3099._3033;

public class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] answer = new int[rows][columns];
        System.arraycopy(matrix, 0, answer, 0, rows);

        int[] max = new int[columns];
        for (int c = 0; c < columns; c++) {
            max[c] = matrix[0][c];
            for (int r = 1; r < rows; r++) {
                max[c] = Math.max(max[c], matrix[r][c]);
            }
        }

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < columns; c++) {
                if (answer[r][c] == -1) {
                    answer[r][c] = max[c];
                }
            }
        }

        return answer;
    }
}