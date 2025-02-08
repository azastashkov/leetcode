package easy._0500_0599._0594;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int findLHS(int[] nums) {
        Map<Integer, Integer> cnt = new HashMap<>();
        for (int n : nums) {
            cnt.merge(n, 1, Integer::sum);
        }

        int lhs = 0;
        for (Map.Entry<Integer, Integer> entry : cnt.entrySet()) {
            Integer n = entry.getKey();
            Integer c = entry.getValue();

            if (cnt.containsKey(n + 1)) {
                lhs = Math.max(lhs, c + cnt.get(n + 1));
            }
        }

        return lhs;
    }
}
