package easy._0700_0799._0704;

public class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int val = nums[mid];
            if (target < val) {
                right = mid - 1;
            } else if (target > val) {
                left = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}