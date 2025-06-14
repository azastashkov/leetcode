package easy._2900_2999._2903;

public class Solution {
    public int[] findIndices(int[] nums, int indexDifference, int valueDifference) {
        int l = nums.length;
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j < l; j++) {
                if (Math.abs(i - j) >= indexDifference && Math.abs(nums[i] - nums[j]) >= valueDifference) {
                    return new int[] { i , j };
                }
            }
        }

        return new int[] { -1, -1 };
    }
}