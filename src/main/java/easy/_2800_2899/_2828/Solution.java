package easy._2800_2899._2828;

import java.util.List;

public class Solution {
    public boolean isAcronym(List<String> words, String s) {
        StringBuilder sb = new StringBuilder();
        for (String w : words) {
            sb.append(w.charAt(0));
        }

        return s.contentEquals(sb);
    }
}