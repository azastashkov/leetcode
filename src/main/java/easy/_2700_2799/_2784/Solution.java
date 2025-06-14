package easy._2700_2799._2784;

import java.util.Arrays;

public class Solution {
    public boolean isGood(int[] nums) {
        int l = nums.length;
        if (l < 2) {
            return false;
        }

        Arrays.sort(nums);

        for (int i = 1; i < l; i++) {
            if (nums[i - 1] != i) {
                return false;
            }
        }

        return nums[l - 2] == nums[l - 1];
    }
}