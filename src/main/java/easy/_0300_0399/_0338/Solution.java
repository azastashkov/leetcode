package easy._0300_0399._0338;

public class Solution {
    public int[] countBits(int n) {
        int[] c = new int[n + 1];

        for (int i = 0; i <= n; i++) {
            int m = i;
            while (m > 0) {
                if ((m & 1) == 1) {
                    c[i]++;
                }
                m >>= 1;
            }
        }

        return c;
    }
}
