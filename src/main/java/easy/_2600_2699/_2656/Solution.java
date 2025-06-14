package easy._2600_2699._2656;

import java.util.Arrays;

public class Solution {
    public int maximizeSum(int[] nums, int k) {
        Arrays.sort(nums);

        int l = nums.length, sum = 0;
        while (k-- > 0) {
            int t = nums[l - 1];
            nums[l - 1] = t + 1;
            sum += t;
        }

        return sum;
    }
}