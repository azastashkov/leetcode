package easy._2500_2599._2529;

public class Solution {
    public int maximumCount(int[] nums) {
        int pos = 0, l = nums.length;
        for (int i = l - 1; i >= 0; i--) {
            if (nums[i] > 0) {
                pos++;
            } else {
                break;
            }
        }

        int neg = 0;
        for (int n : nums) {
            if (n < 0) {
                neg++;
            } else {
                break;
            }
        }

        return Math.max(pos, neg);
    }
}