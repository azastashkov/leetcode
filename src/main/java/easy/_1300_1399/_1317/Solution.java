package easy._1300_1399._1317;

public class Solution {
    public int[] getNoZeroIntegers(int n) {
        for (int i = 0; i < n; i++) {
            int b = n - i;
            if (noZero(i) && noZero(b)) {
                return new int[] { i, b };
            }
        }

        return new int[] {};
    }

    private boolean noZero(int i) {
        if (i == 0) {
            return false;
        }

        while (i > 0) {
            if (i % 10 == 0) {
                return false;
            }
            i /= 10;
        }

        return true;
    }
}