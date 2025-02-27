package easy._0100_0199._0125;

class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            char ci = s.charAt(i);
            char cj = s.charAt(j);
            if (!Character.isLetterOrDigit(ci)) {
                ++i;
            } else if (!Character.isLetterOrDigit(cj)) {
                --j;
            } else if (Character.toLowerCase(ci) != Character.toLowerCase(cj)) {
                return false;
            } else {
                ++i;
                --j;
            }
        }
        return true;
    }
}