package easy._0700_0799._0747;

public class Solution {
    public int dominantIndex(int[] nums) {
        int l = nums.length;
        if (l < 2) {
            return -1;
        }

        int maxIndex = 0;
        int max = nums[maxIndex];

        for (int i = 1; i < l; i++) {
            int n = nums[i];
            if (n > max) {
                max = n;
                maxIndex = i;
            }
        }

        for (int i = 0; i < l; i++) {
            if (maxIndex != i && max < nums[i] * 2) {
                return -1;
            }
        }

        return maxIndex;
    }
}
