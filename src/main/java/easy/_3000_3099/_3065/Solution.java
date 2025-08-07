package easy._3000_3099._3065;

import java.util.Arrays;

public class Solution {
    public int minOperations(int[] nums, int k) {
        Arrays.sort(nums);

        int l = nums.length;
        for (int i = 0; i < l; i++) {
            if (nums[i] >= k) {
                return i;
            }
        }

        return l;
    }
}