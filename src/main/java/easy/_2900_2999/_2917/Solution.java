package easy._2900_2999._2917;

public class Solution {
    public int findKOr(int[] nums, int k) {
        int res = 0;

        for (int i = 0; i < 32; i++) {
            int count = 0;
            int bit = 1 << i;
            for (int n : nums) {
                if ((n & bit) > 0) {
                    count++;
                }
            }

            if (count >= k) {
                res |= bit;
            }
        }

        return res;
    }
}