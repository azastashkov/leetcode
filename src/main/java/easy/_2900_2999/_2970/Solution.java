package easy._2900_2999._2970;

public class Solution {
    public int incremovableSubarrayCount(int[] nums) {
        int i = 0, n = nums.length;
        while (i + 1 < n && nums[i] < nums[i + 1]) {
            ++i;
        }

        if (i == n - 1) {
            return n * (n + 1) / 2;
        }

        int ans = i + 2;
        for (int j = n - 1; j > 0; --j) {
            while (i >= 0 && nums[i] >= nums[j]) {
                --i;
            }

            ans += i + 2;
            if (nums[j - 1] >= nums[j]) {
                break;
            }
        }

        return ans;
    }
}