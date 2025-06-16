package easy._2900_2999._2965;

public class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int s = n * n;
        int[] nums = new int[s + 1];
        for (int[] rows : grid) {
            for (int c = 0; c < n; c++) {
                int v = rows[c];
                nums[v]++;
            }
        }

        int a = -1, b = -1;
        for (int i = 1; i <= s; i++) {
            if (nums[i] == 0) {
                b = i;
            } else if (nums[i] > 1) {
                a = i;
            }
        }

        return new int[] { a, b };
    }
}