package easy._0700_0799._0762;

public class Solution {
    public int countPrimeSetBits(int left, int right) {
        int count = 0;
        for (int n = left; n <= right; n++) {
            int k = n, sb = 0;
            while (k > 0) {
                int r = k % 2;
                if (r == 1) {
                    sb++;
                }
                k >>>= 1;
            }

            int j = 1;
            if (sb > 1) {
                for (int i = 2; i < sb; i++) {
                    if (sb % i == 0) {
                        j++;
                    }
                    if (j > 1) {
                        break;
                    }
                }

                if (j == 1) {
                    count++;
                }
            }
        }

        return count;
    }
}