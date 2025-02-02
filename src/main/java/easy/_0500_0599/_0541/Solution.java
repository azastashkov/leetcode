package easy._0500_0599._0541;

public class Solution {
    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        int n = chars.length;

        for (int i = 0; i < n; i += k * 2) {
            int l = i;
            int r = Math.min(i + k - 1, n - 1);
            while (l < r) {
                swap(chars, l, r);
                l++;
                r--;
            }
        }

        return new String(chars);
    }

    private void swap(char[] chars, int l, int r) {
        char t = chars[l];
        chars[l] = chars[r];
        chars[r] = t;
    }
}
