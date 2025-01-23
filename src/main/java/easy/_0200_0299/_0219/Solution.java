package easy._0200_0299._0219;

import java.util.Map;
import java.util.HashMap;

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> pos = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            Integer j = pos.get(num);
            if (j != null && Math.abs(i - j) <= k) {
                return true;
            }
            pos.put(num, i);
        }

        return false;
    }
}
