package easy._2500_2599._2595;

public class Solution {
    public int[] evenOddBit(int n) {
        int even = 0, odd = 0, bitIndex = 0;
        while (n > 0) {
            int r = n % 2;
            if (bitIndex % 2 == 0) {
                if (r == 1) {
                    even++;
                }
            } else {
                if (r == 1) {
                    odd++;
                }
            }
            bitIndex++;
            n /= 2;
        }

        return new int[] { even, odd };
    }
}