package easy._0800_0899._0884;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] words1 = s1.split("\\W+");
        String[] words2 = s2.split("\\W+");

        Map<String, Integer> wordCount = new HashMap<>();
        for (String w : words1) {
            wordCount.merge(w, 1, Integer::sum);
        }
        for (String w : words2) {
            wordCount.merge(w, 1, Integer::sum);
        }

        Set<String> uncommon = new HashSet<>();
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() == 1) {
                uncommon.add(entry.getKey());
            }
        }

        return uncommon.toArray(new String[0]);
    }
}