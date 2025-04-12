package easy._0900_0999._0976;

import java.util.Arrays;

public class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);

        for (int i = nums.length - 1; i >= 2; i--) {
            int s = nums[i - 2] + nums[i - 1];
            if (s > nums[i]) {
                return s + nums[i];
            }
        }

        return 0;
    }
}