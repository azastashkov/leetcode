package easy._2700_2799._2733;

import java.util.Arrays;

public class Solution {
    public int findNonMinOrMax(int[] nums) {
        int l = nums.length;
        if (l < 3) {
            return -1;
        }

        Arrays.sort(nums);

        return nums[1];
    }
}