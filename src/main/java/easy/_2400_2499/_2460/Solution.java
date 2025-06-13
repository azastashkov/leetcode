package easy._2400_2499._2460;

public class Solution {
    public int[] applyOperations(int[] nums) {
        int l = nums.length;
        for (int i = 0; i < l - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }

        int[] arr = new int[l];

        int i = 0;
        for (int n : nums) {
            if (n > 0) {
                arr[i++] = n;
            }
        }

        return arr;
    }
}