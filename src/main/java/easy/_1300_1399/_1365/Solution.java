package easy._1300_1399._1365;

import java.util.Arrays;

public class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = nums.clone();

        Arrays.sort(arr);

        for (int i = 0; i < nums.length; ++i) {
            nums[i] = binarySearch(arr, nums[i]);
        }

        return nums;
    }

    private int binarySearch(int[] nums, int x) {
        int l = 0, r = nums.length;
        while (l < r) {
            int mid = (l + r) >> 1;
            if (nums[mid] >= x) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }

        return l;
    }
}