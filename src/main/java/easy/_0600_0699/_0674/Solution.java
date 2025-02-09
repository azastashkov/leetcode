package easy._0600_0699._0674;

public class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }

        int inc = 1, max = inc;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] < nums[i]) {
                inc++;
            } else {
                inc = 1;
            }
            max = Math.max(max, inc);
        }

        return max;
    }
}
