package easy._0400_0499._0409;

public class Solution {
    public int longestPalindrome(String s) {
        int[] c = new int[128];
        int l = s.length();
        for (int i = 0; i < l; i++) {
            c[s.charAt(i)]++;
        }

        int r = 0;
        for (int i = 0; i < c.length; i++) {
            r += c[i] / 2 * 2;
        }

        return r += r < l ? 1 : 0;
    }
}
