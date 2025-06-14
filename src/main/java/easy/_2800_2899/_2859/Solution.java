package easy._2800_2899._2859;

import java.util.List;

public class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int sum = 0, i = 0;
        for (Integer n : nums) {
            if (Integer.bitCount(i++) == k) {
                sum += n;
            }
        }

        return sum;
    }
}