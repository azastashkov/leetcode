package easy._3000_3099._3065;

public class Solution {
    public int minOperations(int[] nums, int k) {
        int count = 0;
        for (int n : nums) {
            if (n < k) {
                count++;
            }
        }

        return count;
    }
}