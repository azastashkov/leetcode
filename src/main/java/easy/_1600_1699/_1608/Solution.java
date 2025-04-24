package easy._1600_1699._1608;

public class Solution {
    public int specialArray(int[] nums) {
        int l = nums.length;
        for (int x = 0; x <= l; x++) {
            int count = 0;
            for (int n : nums) {
                if (n >= x) {
                    count++;
                }
            }

            if (x == count) {
                return x;
            }
        }

        return -1;
    }
}