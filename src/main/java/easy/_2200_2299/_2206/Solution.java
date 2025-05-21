package easy._2200_2299._2206;

public class Solution {
    public boolean divideArray(int[] nums) {
        int[] count = new int[501];
        for (int n : nums) {
            count[n]++;
        }

        for (int c : count) {
            if (c % 2 != 0) {
                return false;
            }
        }

        return true;
    }
}