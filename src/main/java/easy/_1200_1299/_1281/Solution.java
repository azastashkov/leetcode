package easy._1200_1299._1281;

public class Solution {
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while (n > 0) {
            int r = n % 10;
            product *= r;
            sum += r;
            n /= 10;
        }

        return product - sum;
    }
}