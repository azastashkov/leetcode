package easy._2000_2999._2006;

public class Solution {
    public int countKDifference(int[] nums, int k) {
        int l = nums.length, count = 0;
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j < l; j++) {
                if (Math.abs(nums[i] - nums[j]) == k) {
                    count++;
                }
            }
        }

        return count;
    }
}