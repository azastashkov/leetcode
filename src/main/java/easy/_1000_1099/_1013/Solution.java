package easy._1000_1099._1013;

public class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int total = 0;
        for (int i : arr) {
            total += i;
        }

        if (total % 3 != 0) {
            return false;
        }

        int c = 0, s = total / 3, t = 0;
        for (int i : arr) {
            t += i;
            if (t == s) {
                t = 0;
                c++;
            }
        }

        return c >= 3;
    }
}