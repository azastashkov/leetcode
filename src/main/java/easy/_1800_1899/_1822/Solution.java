package easy._1800_1899._1822;

public class Solution {
    public int arraySign(int[] nums) {
        int product = 1;
        for (int n : nums) {
            if (n == 0) {
                return 0;
            }
            if (n < 0) {
                product *= -1;
            }
        }

        return signFunc(product);
    }

    private int signFunc(int n) {
        return Integer.compare(n, 0);
    }
}