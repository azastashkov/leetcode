package easy._2700_2799._2778;

public class Solution {
    public int sumOfSquares(int[] nums) {
        int sum = 0, i = 1, n = nums.length;
        for (int x : nums) {
            if (n % i == 0) {
                sum += (x * x);
            }
            i++;
        }

        return sum;
    }
}