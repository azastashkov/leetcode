package easy._3000_3099._3005;

public class Solution {
    public int maxFrequencyElements(int[] nums) {
        int[] frequencies = new int[101];
        for (int n : nums) {
            frequencies[n]++;
        }

        int total = 0;
        for (int f : frequencies) {
            if (f > 0) {
                total++;
            }
        }

        return total;
    }
}