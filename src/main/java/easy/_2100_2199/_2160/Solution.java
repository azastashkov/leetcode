package easy._2100_2199._2160;

import java.util.Arrays;

public class Solution {
    public int minimumSum(int num) {
        int[] nums = new int[4];
        for (int i = 0; num != 0; ++i) {
            nums[i] = num % 10;
            num /= 10;
        }

        Arrays.sort(nums);

        int firstMin = nums[0];
        int secondMin = nums[1];

        return 10 * firstMin + nums[2] + 10 * secondMin + nums[3];
    }
}