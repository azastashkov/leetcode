package easy._2400_2499._2404;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int mostFrequentEven(int[] nums) {
        int l = nums.length;
        Map<Integer, Integer> evensCounts = new HashMap<>();
        for (int n : nums) {
            if (n % 2 == 0) {
                evensCounts.merge(n, 1, Integer::sum);
            }
        }

        int maxFrequencyEven = -1, maxFrequency = 0;
        var entries = evensCounts.entrySet();
        for (var entry : entries) {
            int n = entry.getKey();
            int frequency = entry.getValue();
            if (maxFrequency < frequency || (maxFrequency == frequency && maxFrequencyEven > n)) {
                maxFrequencyEven = n;
                maxFrequency = frequency;
            }
        }

        return maxFrequencyEven;
    }
}