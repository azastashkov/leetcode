package easy._2000_2999._2085;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int countWords(String[] words1, String[] words2) {
        Map<String, Integer> freq1 = wordFrequency(words1);
        Map<String, Integer> freq2 = wordFrequency(words2);

        int count = 0;
        var entries1 = freq1.entrySet();
        for (var e : entries1) {
            int v1 = e.getValue();
            if (v1 == 1) {
                String k1 = e.getKey();
                Integer v2 = freq2.get(k1);
                if (v2 != null && v2 == 1) {
                    count++;
                }
            }
        }

        return count;
    }

    private Map<String, Integer> wordFrequency(String[] words) {
        Map<String, Integer> freq = new HashMap<>();
        for (String w : words) {
            freq.merge(w, 1, Integer::sum);
        }

        return freq;
    }
}