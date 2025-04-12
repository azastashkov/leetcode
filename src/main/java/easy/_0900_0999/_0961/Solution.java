package easy._0900_0999._0961;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (!set.add(i)) {
                return i;
            }
        }
        return 0;
    }
}