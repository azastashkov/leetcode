package easy._0800_0899._0804;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        final String[] morseCodes = new String[] {
                ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
                "...","-","..-","...-",".--","-..-","-.--","--.."
        };
        final Set<String> set = new HashSet<>();

        for (String word : words) {
            StringBuilder sb = new StringBuilder();
            int l = word.length();
            for (int i = 0; i < l; i++) {
                char c = word.charAt(i);
                sb.append(morseCodes[c - 'a']);
            }
            set.add(sb.toString());
        }

        return set.size();
    }
}