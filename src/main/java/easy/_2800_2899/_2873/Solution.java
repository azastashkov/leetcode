package easy._2800_2899._2873;

public class Solution {
    public long maximumTripletValue(int[] nums) {
        int l = nums.length, max = 0;
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j < l; j++) {
                for (int k = j + 1; k < l; k++) {
                    int v = (nums[i] - nums[j]) * nums[k];
                    if (v > max) {
                        max = v;
                    }
                }
            }
        }

        return max;
    }
}