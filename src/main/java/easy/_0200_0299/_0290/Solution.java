package easy._0200_0299._0290;

import java.util.Map;
import java.util.HashMap;

public class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) {
            return false;
        }

        Map<Character, String> ctow = new HashMap<>();
        Map<String, Character> wtoc = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            char c = pattern.charAt(i);
            String w = words[i];

            String mw = ctow.get(c);
            Character mc = wtoc.get(w);

            if ((mw != null && !mw.equals(w)) || (mc != null && !mc.equals(c))) {
                return false;
            }

            ctow.put(c, w);
            wtoc.put(w, c);
        }

        return true;
    }
}
