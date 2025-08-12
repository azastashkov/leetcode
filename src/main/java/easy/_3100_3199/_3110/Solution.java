package easy._3100_3199._3110;

public class Solution {
    public int scoreOfString(String s) {
        int l = s.length();
        if (l < 2) {
            return 0;
        }

        int score = 0;
        for (int i = 1; i < l; i++) {
            score += Math.abs(s.charAt(i - 1) - s.charAt(i));
        }

        return score;
    }
}