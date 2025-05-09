package easy._1900_1999._1991;

public class Solution {
    public int findMiddleIndex(int[] nums) {
        int l = 0, r = 0;
        for (int n : nums) {
            r += n;
        }

        for (int i = 0; i < nums.length; i++) {
            r -= nums[i];
            if (l == r) {
                return i;
            }
            l += nums[i];
        }
        return -1;
    }
}