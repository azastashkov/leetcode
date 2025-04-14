package easy._1000_1999._1051;

import java.util.Arrays;

public class Solution {
    public int heightChecker(int[] heights) {
        int l = heights.length;
        int[] expected = new int[l];
        System.arraycopy(heights, 0, expected, 0, l);

        Arrays.sort(expected);

        int c = 0;
        for (int i = 0; i < l; i ++) {
            if (expected[i] != heights[i]) {
                c++;
            }
        }

        return c;
    }
}