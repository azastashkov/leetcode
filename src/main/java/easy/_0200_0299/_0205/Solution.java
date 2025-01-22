package easy._0200_0299._0205;

import java.util.Map;
import java.util.HashMap;

public class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> d1 = new HashMap<>();
        Map<Character, Character> d2 = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i);
            char b = t.charAt(i);

            Character da = d1.get(a);
            if (da != null && da != b) {
                return false;
            }

            Character db = d2.get(b);
            if (db != null && db != a) {
                return false;
            }

            d1.put(a, b);
            d2.put(b, a);
        }

        return true;
    }
}
