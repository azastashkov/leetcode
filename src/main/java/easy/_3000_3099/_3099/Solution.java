package easy._3000_3099._3099;

public class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = 0, n = x;
        while (n > 0) {
            int r = n % 10;
            sum += r;
            n /= 10;
        }

        if (x % sum == 0) {
            return sum;
        }

        return -1;
    }
}