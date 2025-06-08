package easy._2300_2399._2395;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean findSubarrays(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int l = nums.length;
        for (int i = 1; i < l; i++) {
            int sum = nums[i - 1] + nums[i];
            if (!set.add(sum)) {
                return true;
            }
        }

        return false;
    }
}