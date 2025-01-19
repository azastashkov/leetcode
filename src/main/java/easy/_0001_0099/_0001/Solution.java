package easy._0001_0099._0001;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; ; ++i) {
            int a = nums[i];
            int b = target - a;
            if (map.containsKey(b)) {
                return new int[] { map.get(b), i };
            }
            map.put(a, i);
        }
    }
}
