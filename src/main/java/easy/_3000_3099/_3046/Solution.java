package easy._3000_3099._3046;

public class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int[] count = new int[101];
        for (int n : nums) {
            if (++count[n] >= 3) {
                return false;
            }
        }

        return true;
    }
}