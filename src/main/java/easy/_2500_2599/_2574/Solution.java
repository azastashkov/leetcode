package easy._2500_2599._2574;

public class Solution {
    public int[] leftRightDifference(int[] nums) {
        int l = nums.length;
        int[] leftSum = new int[l];
        int[] rightSum = new int[l];

        int lsum = 0;
        for (int i = 0; i < l; i++) {
            leftSum[i] = lsum;
            lsum += nums[i];
        }

        int rsum = 0;
        for (int i = l - 1; i >= 0; i--) {
            rightSum[i] = rsum;
            rsum += nums[i];
        }

        int[] answer = new int[l];
        for (int i = 0; i < l; i++) {
            answer[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return answer;
    }
}