package easy._2800_2899._2873;

public class Solution {
    public long maximumTripletValue(int[] nums) {
        long ans = 0, mxDiff = 0;
        int mx = 0;
        for (int x : nums) {
            ans = Math.max(ans, mxDiff * x);
            mxDiff = Math.max(mxDiff, mx - x);
            mx = Math.max(mx, x);
        }

        return ans;
    }
}