package easy._1400_1499._1422;

public class Solution {
    public int maxScore(String s) {
        int l = 0, r = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '1') {
                r++;
            }
        }

        int res = 0;
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) == '0') {
                l++;
            } else {
                r--;
            }
            res = Math.max(res, l + r);
        }

        return res;
    }
}