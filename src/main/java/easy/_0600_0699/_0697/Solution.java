package easy._0600_0699._0697;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> cnt = new HashMap<>();
        Map<Integer, Integer> left = new HashMap<>();
        Map<Integer, Integer> right = new HashMap<>();

        int degree = 0;
        for (int i = 0; i < nums.length; ++i) {
            int v = nums[i];
            cnt.put(v, cnt.getOrDefault(v, 0) + 1);
            degree = Math.max(degree, cnt.get(v));
            if (!left.containsKey(v)) {
                left.put(v, i);
            }
            right.put(v, i);
        }

        int ans = Integer.MAX_VALUE;
        for (int v : cnt.keySet()) {
            if (cnt.get(v) == degree) {
                int currentLength = right.get(v) - left.get(v) + 1;
                if (currentLength < ans) {
                    ans = currentLength;
                }
            }
        }

        return ans;
    }
}