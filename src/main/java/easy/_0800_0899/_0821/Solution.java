package easy._0800_0899._0821;

import java.util.Arrays;

public class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] ans = new int[n];

        Arrays.fill(ans, Integer.MAX_VALUE);

        for (int i = 0, pre = Integer.MIN_VALUE; i < n; i++) {
            if (s.charAt(i) == c) {
                pre = i;
            }
            if (pre != Integer.MIN_VALUE) {
                ans[i] = Math.min(ans[i], i - pre);
            }
        }

        for (int i = n - 1, suf = Integer.MAX_VALUE; i >= 0; i--) {
            if (s.charAt(i) == c) {
                suf = i;
            }
            if (suf != Integer.MAX_VALUE) {
                ans[i] = Math.min(ans[i], suf - i);
            }
        }

        return ans;
    }
}