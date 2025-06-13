package easy._2400_2499._2465;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int distinctAverages(int[] nums) {
        Arrays.sort(nums);

        Set<Integer> set = new HashSet<>();
        int l = nums.length;
        for (int i = 0; i < l / 2; i++) {
            int avg = (nums[i] + nums[l - i - 1]) / 2;
            set.add(avg);
        }

        return set.size();
    }
}