package easy._2500_2599._2520;

public class Solution {
    public int countDigits(final int num) {
        int count = 0, n = num;
        while (n > 0) {
            int r = n % 10;
            if (num % r == 0) {
                count++;
            }
            n /= 10;
        }

        return count;
    }
}