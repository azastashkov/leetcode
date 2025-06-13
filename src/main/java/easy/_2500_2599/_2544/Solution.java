package easy._2500_2599._2544;

public class Solution {
    public int alternateDigitSum(int n) {
        int[] num = new int[32];
        int i = -1;
        while (n > 0) {
            int r = n % 10;
            num[++i] = r;
            n /= 10;
        }

        int sign = 1, sum = 0;
        while (i >= 0) {
            int d = num[i];
            sum += (sign * d);
            sign = -sign;
            i--;
        }

        return sum;
    }
}