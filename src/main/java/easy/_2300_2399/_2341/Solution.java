package easy._2300_2399._2341;

public class Solution {
    public int[] numberOfPairs(int[] nums) {
        int[] count = new int[101];
        for (int n : nums) {
            count[n]++;
        }

        int pairs = 0, leftovers = 0;
        for (int c : count) {
            if (c > 0) {
                pairs += c >> 1;
                leftovers += c % 2;
            }
        }

        return new int[] { pairs, leftovers };
    }
}