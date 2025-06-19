package easy._2900_2999._2980;

public class Solution {
    public boolean hasTrailingZeros(int[] nums) {
        int cnt = 0;
        for (int n : nums) {
            cnt += (n & 1 ^ 1);
        }

        return cnt >= 2;
    }
}