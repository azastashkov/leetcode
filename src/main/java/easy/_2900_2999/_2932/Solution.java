package easy._2900_2999._2932;

public class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int l = nums.length, max = Integer.MIN_VALUE;
        for (int x : nums) {
            for (int y : nums) {
                if (Math.abs(x - y) <= Math.min(x, y)) {
                    int xor = x ^ y;
                    if (xor > max) {
                        max = xor;
                    }
                }
            }
        }

        return max;
    }
}