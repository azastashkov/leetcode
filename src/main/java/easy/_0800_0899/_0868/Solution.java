package easy._0800_0899._0868;

public class Solution {
    public int binaryGap(int n) {
        int maxD = 0;
        int last1Pos = -1;
        int c = 0;

        while (n > 0) {
            int r = n % 2;
            if (r == 1) {
                if (last1Pos >= 0) {
                    maxD = Math.max(maxD, c - last1Pos);
                }
                last1Pos = c;
            }
            n >>>= 1;
            c++;
        }

        return maxD;
    }
}