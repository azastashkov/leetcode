package easy._1200_1299._1221;

public class Solution {
    public int balancedStringSplit(String s) {
        int l = s.length();
        int rc = 0, lc = 0, total = 0;
        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);
            if (c == 'L') {
                lc++;
            } else {
                rc++;
            }

            if (lc == rc) {
                total++;
            }
        }

        return total;
    }
}