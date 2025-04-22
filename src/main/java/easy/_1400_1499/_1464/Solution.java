package easy._1400_1499._1464;

public class Solution {
    public int maxProduct(int[] nums) {
        int l = nums.length;
        int max = 0;
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j < l; j++) {
                max = Math.max(max, (nums[i] - 1) * (nums[j] - 1));
            }
        }

        return max;
    }
}