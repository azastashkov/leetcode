package easy._0200_0299._0231;

public class Solution {
    public boolean isPowerOfTwo(int n) {
        int c = 0;
        while (n > 0 && c <= 1) {
            if ((n & 1) == 1) {
                c++;
            }
            n >>= 1;
        }

        return c == 1;
    }
}
