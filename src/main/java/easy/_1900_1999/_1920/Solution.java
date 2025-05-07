package easy._1900_1999._1920;

public class Solution {
    public int[] buildArray(int[] nums) {
        int l = nums.length;
        int[] ans = new int[l];
        for (int i = 0; i < l; i++) {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }
}