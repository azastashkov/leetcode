package easy._2400_2499._2441;

import java.util.Arrays;

public class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);

        int l = nums.length;
        for (int i = l - 1; i >= 0; i--) {
            int k = nums[i];
            if (Arrays.binarySearch(nums, -k) >= 0) {
                return k;
            }
        }

        return -1;
    }
}