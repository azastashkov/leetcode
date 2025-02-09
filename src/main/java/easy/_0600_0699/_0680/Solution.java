package easy._0600_0699._0680;

public class Solution {
    public boolean validPalindrome(String s) {
        int l = s.length();
        for (int i = 0, j = l - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return check(s, i + 1, j) || check(s, i, j - 1);
            }
        }
        return true;
    }

    private boolean check(String s, int i, int j) {
        for (; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
