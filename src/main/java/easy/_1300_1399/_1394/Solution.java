package easy._1300_1399._1394;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int j : arr) {
            freq.merge(j, 1, Integer::sum);
        }

        int max = -1;
        var entries = freq.entrySet();
        for (var entry : entries) {
            var key = entry.getKey();
            if (Objects.equals(key, entry.getValue())) {
                max = Math.max(max, key);
            }
        }

        return max;
    }
}