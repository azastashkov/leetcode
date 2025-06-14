package easy._2800_2899._2824;

import java.util.List;

public class Solution {
    public int countPairs(List<Integer> nums, int target) {
        int l = nums.size(), count = 0;
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j < l; j++) {
                if (nums.get(i) + nums.get(j) < target) {
                    count++;
                }
            }
        }

        return count;
    }
}