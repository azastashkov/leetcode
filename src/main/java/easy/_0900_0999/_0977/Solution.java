package easy._0900_0999._0977;

public class Solution {
    public int[] sortedSquares(int[] nums) {
        int l = nums.length;
        int[] res = new int[l];

        for (int i = 0, j = l - 1, k = l - 1; i <= j; k--) {
            int a = nums[i] * nums[i];
            int b = nums[j] * nums[j];
            if (a > b) {
                res[k] = a;
                i++;
            } else {
                res[k] = b;
                j--;
            }
        }

        return res;
    }
}
