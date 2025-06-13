package easy._2600_2699._2643;

public class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int maxOnesRowIndex = 0;
        int maxOnes = 0, r = 0;
        for (int[] row : mat) {
            int ones = 0;
            for (int i : row) {
                if (i == 1) {
                    ones++;
                }
            }
            if (ones > maxOnes) {
                maxOnesRowIndex = r;
                maxOnes = ones;
            }
            r++;
        }

        return new int[] { maxOnesRowIndex, maxOnes };
    }
}