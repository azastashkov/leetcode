package easy._3000_3099._3079;

public class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int sum = 0;
        for (int n : nums) {
            sum += encrypt(n);
        }

        return sum;
    }

    private int encrypt(int n) {
        int digits = 0, max = 0;
        while (n > 0) {
            int r = n % 10;
            max = Math.max(max, r);
            n /= 10;
            digits++;
        }

        int encrypted = 0;
        while (digits-- > 0) {
            encrypted += (max * (int) Math.pow(10, digits));
        }

        return encrypted;
    }
}