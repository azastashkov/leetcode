package easy._1900_1999._1984;

import java.util.Arrays;

public class Solution {
    public int minimumDifference(int[] nums, int k) {
        int l = nums.length;
        if (l <= 1 || l < k) {
            return 0;
        }

        Arrays.sort(nums);

        int min = Integer.MAX_VALUE;
        for (int i = k - 1; i < l; i++) {
            int diff = nums[i] - nums[i - k + 1];
            min = Math.min(min, diff);
        }

        return min;
    }
}