package easy._1000_1999._1078;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[] words = text.split(" ");
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < words.length - 2; i++) {
            if (first.equals(words[i]) && second.equals(words[i + 1])) {
                ans.add(words[i + 2]);
            }
        }

        return ans.toArray(new String[0]);
    }
}