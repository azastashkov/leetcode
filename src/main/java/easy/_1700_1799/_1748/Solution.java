package easy._1700_1799._1748;

public class Solution {
    public int sumOfUnique(int[] nums) {
        int[] count = new int[101];
        for (int n : nums) {
            count[n]++;
        }

        int sum = 0;
        for (int i = 0; i < 101; i++) {
            if (count[i] == 1) {
                sum += i;
            }
        }

        return sum;
    }
}