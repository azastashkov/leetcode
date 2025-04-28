package easy._1700_1799._1758;

public class Solution {
    public int minOperations(String s) {
        int l = s.length();
        if (l == 1) {
            return 0;
        }

        int count = 0;
        char p = s.charAt(0);
        for (int i = 1; i < l; i++) {
            char c = s.charAt(i);
            if (c == p) {
                count++;
                p = flip(c);
            } else {
                p = c;
            }
        }

        return Math.min(count, l - count);
    }

    private char flip(char c) {
        return c == '1' ? '0' : '1';
    }
}