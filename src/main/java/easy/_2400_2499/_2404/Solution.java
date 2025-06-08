package easy._2400_2499._2404;

import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public int mostFrequentEven(int[] nums) {
        int l = nums.length;
        Map<Integer, Integer> evensCounts = new TreeMap<>();
        for (int n : nums) {
            if (n % 2 == 0) {
                evensCounts.merge(n, 1, Integer::sum);
            }
        }

        int maxFrequency = 0, maxFrequencyEven = -1;
        var entries = evensCounts.entrySet();
        for (var entry : entries) {
            int n = entry.getKey();
            int frequency = entry.getValue();
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                maxFrequencyEven = n;
            }
        }

        return maxFrequencyEven;
    }
}