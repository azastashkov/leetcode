package easy._2200_2299._2239;

public class Solution {
    public int findClosestNumber(int[] nums) {
        int minDistance = Integer.MAX_VALUE;
        int closest = Integer.MIN_VALUE;
        for (int n : nums) {
            int d = Math.abs(n);
            if (d < minDistance) {
                minDistance = d;
                closest = n;
            } else if (d == minDistance) {
                if (n > closest) {
                    closest = n;
                }
            }
        }

        return closest;
    }
}