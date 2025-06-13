package easy._2400_2499._2475;

public class Solution {
    public int unequalTriplets(int[] nums) {
        int count = 0;
        int l = nums.length;
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j < l; j++) {
                for (int k = j + 1; k < l; k++) {
                    if (nums[i] != nums[j] && nums[i] != nums[k] && nums[j] != nums[k]) {
                        count++;
                    }
                }
            }
        }

        return count;
    }
}