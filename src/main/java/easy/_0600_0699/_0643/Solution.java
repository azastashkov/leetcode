package easy._0600_0699._0643;

public class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0d;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        double max = sum;
        for (int i = k; i < nums.length; i++) {
            sum += (nums[i] - nums[i - k]);
            max = Math.max(max, sum);
        }

        return max / k;
    }
}
