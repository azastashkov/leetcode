package easy._0300_0399._0342;

public class Solution {
    public boolean isPowerOfFour(int n) {
        while (n > 3) {
            if (n % 4 != 0) {
                return false;
            }
            n /= 4;
        }
        return n == 1;
    }
}
