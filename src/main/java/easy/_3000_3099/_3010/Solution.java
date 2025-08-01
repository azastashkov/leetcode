package easy._3000_3099._3010;

public class Solution {
    public int minimumCost(int[] nums) {
        if (nums.length < 3) {
            return -1;
        }

        int a = nums[0];
        int b = 101;
        int c = 101;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= b) {
                c = b;
                b = nums[i];
            } else if (nums[i] < c) {
                c = nums[i];
            }
        }

        return a + b + c;
    }
}