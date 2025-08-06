package easy._3000_3099._3028;

public class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int pos = 0, count = 0;
        for (int n : nums) {
            if (n != 0) {
                pos += n;
                if (pos == 0) {
                    count++;
                }
            }
        }

        return count;
    }
}