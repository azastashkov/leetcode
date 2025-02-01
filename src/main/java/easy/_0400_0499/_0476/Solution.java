package easy._0400_0499._0476;

public class Solution {
    public int findComplement(int num) {
        int leadingZeros = 0, n = num;

        for (int i = 0; i < 32; i++) {
            if ((n & 1) == 1) {
                leadingZeros = 0;
            } else {
                leadingZeros++;
            }
            n >>>= 1;
        }

        int mask = (1 << (32 - leadingZeros)) - 1;

        return num ^ mask;
    }
}
