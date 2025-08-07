package easy._3000_3099._3074;

import java.util.Arrays;

public class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);

        int total = 0;
        for (int a : apple) {
            total += a;
        }

        int l = capacity.length, count = 0;
        for (int i = l - 1; i >= 0; i--) {
            total -= capacity[i];
            count++;
            if (total <= 0) {
                return count;
            }
        }

        return count;
    }
}