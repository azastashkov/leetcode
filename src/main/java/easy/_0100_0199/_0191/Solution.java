package easy._0100_0199._0191;

public class Solution {
    public int hammingWeight(int n) {
        int c = 0;

        while (n > 0) {
            if ((n & 1) == 1) {
                c++;
            }

            n >>= 1;
        }

        return c;
    }
}
