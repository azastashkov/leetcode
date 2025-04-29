package easy._1800_1899._1837;

public class Solution {
    public int sumBase(int n, int k) {
        int sum = 0;
        while (n > 0) {
            int r = n % k;
            sum += r;
            n /= k;
        }

        return sum;
    }
}