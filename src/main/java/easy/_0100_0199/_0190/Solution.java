package easy._0100_0199._0190;

public class Solution {
    public int reverseBits(int n) {
        int r = 0;
        for (int i = 0; i < 32 && n != 0; i++) {
            r |= (n & 1) << (31 - i);
            n >>= 1;
        }
        return r;
    }
}