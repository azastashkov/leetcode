package easy._0100_0199._0136;

class Solution {
    public int singleNumber(int[] nums) {
        int x = 0;
        for (int num : nums) {
            x ^= num;
        }

        return x;
    }
}