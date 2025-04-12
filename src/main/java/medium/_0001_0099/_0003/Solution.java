package medium._0001_0099._0003;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] count = new int[128];
        int res = 0, n = s.length();
        for (int l = 0, r = 0; r < n; r++) {
            char c = s.charAt(r);
            count[c]++;
            while (count[c] > 1) {
                count[s.charAt(l++)]--;
            }
            res = Math.max(res, r - l + 1);
        }
        return res;
    }
}