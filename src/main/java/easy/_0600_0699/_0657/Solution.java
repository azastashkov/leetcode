package easy._0600_0699._0657;

public class Solution {
    public boolean judgeCircle(String moves) {
        int l = moves.length();
        if (l % 2 != 0) {
            return false;
        }

        int lc = 0, rc = 0, uc = 0, dc = 0;
        for (int i = 0; i < l; i++) {
            char c = moves.charAt(i);
            if (c == 'L') {
                lc++;
            } else if (c == 'R') {
                rc++;
            } else if (c == 'U') {
                uc++;
            } else if (c == 'D') {
                dc++;
            }
        }

        return lc == rc && uc == dc;
    }
}
