package easy._0800_0899._0896;

public class Solution {
    public boolean isMonotonic(int[] nums) {
        int l = nums.length;
        if (l < 2) {
            return true;
        }

        boolean inc = true;
        for (int i = 0; i < l - 1; i++) {
            if (nums[i + 1] < nums[i]) {
                inc = false;
            }
        }

        boolean dec = true;
        for (int i = l - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                dec = false;
            }
        }

        return inc || dec;
    }
}