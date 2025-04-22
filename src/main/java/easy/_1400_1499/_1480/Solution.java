package easy._1400_1499._1480;

public class Solution {
    public int[] runningSum(int[] nums) {
        int l = nums.length;
        int sum = 0;
        for (int i = 0; i < l; i++) {
            sum += nums[i];
            nums[i] = sum;
        }

        return nums;
    }
}