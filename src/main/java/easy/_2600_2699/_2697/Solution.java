package easy._2600_2699._2697;

public class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int l = chars.length;
        for (int i = 0, j = l - 1; i < j; i++, j--) {
            chars[i] = chars[j] = (char) Math.min(chars[i], chars[j]);
        }

        return new String(chars);
    }
}