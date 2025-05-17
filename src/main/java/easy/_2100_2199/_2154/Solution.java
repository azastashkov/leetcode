package easy._2100_2199._2154;

import java.util.Arrays;

public class Solution {
    public int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);

        while (Arrays.binarySearch(nums, original) >= 0) {
            original *= 2;
        }

        return original;
    }
}