package easy._2100_2199._2108;

public class Solution {
    public String firstPalindrome(String[] words) {
        for (String w : words) {
            if (isPalindrome(w)) {
                return w;
            }
        }

        return "";
    }

    private boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
}