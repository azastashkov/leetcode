package easy._1300_1399._1399;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int countLargestGroup(int n) {
        Map<Integer, Integer> freq = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            int k = i, sum = 0;
            while (k > 0) {
                int digit = k % 10;
                sum += digit;
                k /= 10;
            }
            freq.merge(sum, 1, Integer::sum);
        }

        int maxFrequency = 0;
        var values = freq.values();
        for (Integer f : values) {
            maxFrequency = Math.max(maxFrequency, f);
        }

        int count = 0;
        for (Integer f : values) {
            if (f == maxFrequency) {
                count++;
            }
        }

        return count;
    }
}