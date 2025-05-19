package easy._2100_2199._2176;

public class Solution {
    public int countPairs(int[] nums, int k) {
        int count = 0, l = nums.length;
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j < l; j++) {
                if (nums[i] == nums[j] && (i * j) % k == 0) {
                    count++;
                }
            }
        }

        return count;
    }
}