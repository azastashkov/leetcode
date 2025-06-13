package easy._2600_2699._2605;

import java.util.Arrays;

public class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        for (int s : nums1) {
            if (Arrays.binarySearch(nums2, s) >= 0) {
                return s;
            }
        }

        int smallest1 = nums1[0];
        int smallest2 = nums2[0];
        if (smallest1 < smallest2) {
            return Integer.parseInt(smallest1 + "" + smallest2);
        }

        return Integer.parseInt(smallest2 + "" + smallest1);
    }
}