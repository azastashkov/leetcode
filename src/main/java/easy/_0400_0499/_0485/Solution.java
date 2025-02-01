package easy._0400_0499._0485;

public class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        if (nums == null) {
            return 0;
        }

        int max = 0, lastMax = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                lastMax++;
            } else {
                max = Math.max(max, lastMax);
                lastMax = 0;
            }
        }

        return Math.max(max, lastMax);
    }
}
