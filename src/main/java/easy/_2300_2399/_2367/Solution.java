package easy._2300_2399._2367;

public class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        int l = nums.length;
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j < l; j++) {
                for (int k = j + 1; k < l; k++) {
                    if (nums[j] - nums[i] == diff && nums[k] - nums[j] == diff) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}