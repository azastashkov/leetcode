package easy._1800_1899._1800;

public class Solution {
    public int maxAscendingSum(int[] nums) {
        int l = nums.length, prev = 0, sum = 0, max = 0, i = 0;
        while (i < l) {
            int n = nums[i];
            if (n > prev) {
                sum += n;
                prev = n;
                max = Math.max(max, sum);
                i++;
            } else {
                sum = 0;
                prev = 0;
            }
        }

        return max;
    }
}