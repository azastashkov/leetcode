package easy._0200_0299._0268;

public class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int res = n;

        for (int i = 0; i < n; i++) {
            res ^= i ^ nums[i];
        }

        return res;
    }
}
