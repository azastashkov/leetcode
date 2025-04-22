package easy._1400_1499._1446;

public class Solution {
    public int maxPower(String s) {
        int l = s.length();
        int i = 0, max = 0;
        while (i < l) {
            char c = s.charAt(i);
            int lastMax = 0;
            while (i < l && c == s.charAt(i)) {
                lastMax++;
                i++;
            }
            max = Math.max(max, lastMax);
        }

        return max;
    }
}