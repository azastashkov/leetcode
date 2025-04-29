package easy._1800_1899._1827;

public class Solution {
    public int minOperations(int[] nums) {
        int l = nums.length;
        if (l == 1) {
            return 0;
        }

        int max = 0, total = 0;
        for (int n : nums) {
            total += Math.max(0, max + 1 - n);
            max = Math.max(max + 1, n);
        }

        return total;
    }
}