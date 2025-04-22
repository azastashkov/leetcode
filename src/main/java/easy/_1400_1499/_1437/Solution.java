package easy._1400_1499._1437;

public class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int l = nums.length;
        for (int i = 0, j = -1; i < l; i++) {
            int n = nums[i];
            if (j >= 0 && n == 1) {
                if (i - j <= k) {
                    return false;
                }
            }

            if (n == 1) {
                j = i;
            }
        }

        return true;
    }
}