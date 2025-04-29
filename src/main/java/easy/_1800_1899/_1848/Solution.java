package easy._1800_1899._1848;

public class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int n = nums.length;
        int min = n;
        for (int i = 0; i < n; ++i) {
            if (nums[i] == target) {
                min = Math.min(min, Math.abs(i - start));
            }
        }

        return min;
    }
}