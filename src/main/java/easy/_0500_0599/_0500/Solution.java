package easy._0500_0599._0500;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Solution {
    public String[] findWords(String[] words) {
        Set<Character> line1 = new HashSet<>(Arrays.asList( 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p' ));
        Set<Character> line2 = new HashSet<>(Arrays.asList( 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l' ));
        Set<Character> line3 = new HashSet<>(Arrays.asList( 'z', 'x', 'c', 'v', 'b', 'n', 'm' ));

        List<String> w = new LinkedList<>();
        for (String word : words) {
            int l = word.length();

            boolean add = true;
            for (int i = 0; i < l; i++) {
                char c = Character.toLowerCase(word.charAt(i));
                if (!line1.contains(c)) {
                    add = false;
                    break;
                }
            }

            if (!add) {
                add = true;
                for (int i = 0; i < l; i++) {
                    char c = Character.toLowerCase(word.charAt(i));
                    if (!line2.contains(c)) {
                        add = false;
                        break;
                    }
                }
            }

            if (!add) {
                add = true;
                for (int i = 0; i < l; i++) {
                    char c = Character.toLowerCase(word.charAt(i));
                    if (!line3.contains(c)) {
                        add = false;
                        break;
                    }
                }
            }

            if (add) {
                w.add(word);
            }
        }

        String[] out = new String[w.size()];
        int i = 0;
        for (String s : w) {
            out[i++] = s;
        }

        return out;
    }
}
