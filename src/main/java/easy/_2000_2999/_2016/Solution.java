package easy._2000_2999._2016;

public class Solution {
    public int maximumDifference(int[] nums) {
        int min = Integer.MAX_VALUE, max = -1;
        for (int n : nums) {
            if (n > min) {
                max = Math.max(max, n - min);
            } else {
                min = n;
            }
        }

        return max;
    }
}