package easy._2500_2599._2535;

public class Solution {
    public int differenceOfSum(int[] nums) {
        int elementSum = 0;
        for (int n : nums) {
            elementSum += n;
        }

        int digitSum = 0;
        for (int n : nums) {
            while (n > 0) {
                int r = n % 10;
                digitSum += r;
                n /= 10;
            }
        }

        return Math.abs(elementSum - digitSum);
    }
}