package easy._1600_1699._1624;

public class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int l = s.length();
        int max = -1;

        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);
            for (int j = i + 1; j < l; j++) {
                if (c == s.charAt(j)) {
                    max = Math.max(max, j - i - 1);
                }
            }
        }

        return max;
    }
}