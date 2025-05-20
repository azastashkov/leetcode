package easy._2100_2199._2190;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int mostFrequent(int[] nums, int key) {
        Map<Integer, Integer> targets = new HashMap<>();
        int l = nums.length;
        for (int i = 0; i <= l - 2; i++) {
            if (nums[i] == key) {
                targets.merge(nums[i + 1], 1, Integer::sum);
            }
        }

        int max = Integer.MIN_VALUE, maxTarget = 0;
        var entries = targets.entrySet();
        for (var e : entries) {
            int v = e.getValue();
            if (v > max) {
                max = v;
                maxTarget = e.getKey();
            }
        }

        return maxTarget;
    }
}