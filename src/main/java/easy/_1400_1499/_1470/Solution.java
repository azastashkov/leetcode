package easy._1400_1499._1470;

public class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[n << 1];
        for (int i = 0, j = 0; i < n; i++) {
            arr[j++] = nums[i];
            arr[j++] = nums[i + n];
        }

        return arr;
    }
}