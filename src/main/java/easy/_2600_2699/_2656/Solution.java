package easy._2600_2699._2656;

public class Solution {
    public int maximizeSum(int[] nums, int k) {
        int x = 0;
        for (int v : nums) {
            x = Math.max(x, v);
        }

        return k * x + k * (k - 1) / 2;
    }
}