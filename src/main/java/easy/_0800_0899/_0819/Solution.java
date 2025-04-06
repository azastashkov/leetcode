package easy._0800_0899._0819;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedSet = new HashSet<>();
        for (String b : banned) {
            bannedSet.add(b.toLowerCase());
        }

        Map<String, Integer> frequency = new HashMap<>();
        String[] words = paragraph.split("\\W+");
        for (String w : words) {
            String lcw = w.toLowerCase();
            if (!bannedSet.contains(lcw)) {
                frequency.merge(lcw, 1, Integer::sum);
            }
        }

        String res = "";
        int maxFrequency = 0;
        for (Map.Entry<String, Integer> entry : frequency.entrySet()) {
            String w = entry.getKey();
            Integer f = entry.getValue();
            if (f > maxFrequency) {
                maxFrequency = f;
                res = w;
            }
        }

        return res;
    }
}