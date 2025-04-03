package easy._0700_0799._0748;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int l = licensePlate.length();

        Map<Character, Integer> plateChars = new HashMap<>();
        for (int i = 0; i < l; i++) {
            char c = licensePlate.charAt(i);
            if (Character.isLetter(c)) {
                plateChars.merge(Character.toLowerCase(c), 1, Integer::sum);
            }
        }

        String shortestCompletingWord = null;
        int shortestLength = Integer.MAX_VALUE;
        for (String w : words) {
            Map<Character, Integer> map = new HashMap<>(plateChars);
            int k = w.length();
            for (int i = 0; i < k; i++) {
                char c = w.charAt(i);
                Integer cnt = map.get(c);
                if (cnt != null) {
                    cnt--;
                    if (cnt == 0) {
                        map.remove(c);
                    } else {
                        map.put(c, cnt);
                    }
                }

                if (map.isEmpty()) {
                    if (k < shortestLength) {
                        shortestLength = k;
                        shortestCompletingWord = w;
                    }
                }
            }
        }

        return shortestCompletingWord;
    }
}
