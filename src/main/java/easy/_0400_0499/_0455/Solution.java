package easy._0400_0499._0455;

import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int k = g.length;
        int l = s.length;

        for (int i = 0, j = 0; i < k; i++) {
            while (j < l && s[j] < g[i]) {
                j++;
            }

            if (j++ >= l) {
                return i;
            }
        }

        return k;
    }
}