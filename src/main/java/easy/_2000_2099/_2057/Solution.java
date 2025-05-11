package easy._2000_2099._2057;

public class Solution {
    public int smallestEqual(int[] nums) {
        int l = nums.length;
        for (int i = 0; i < l; i++) {
            if (i % 10 == nums[i]) {
                return i;
            }
        }

        return -1;
    }
}