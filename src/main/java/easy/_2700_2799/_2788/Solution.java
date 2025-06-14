package easy._2700_2799._2788;

import java.util.LinkedList;
import java.util.List;

public class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> list = new LinkedList<>();
        for (String w : words) {
            String[] split = w.split("\\" + separator);
            for (String s : split) {
                if (!s.isEmpty()) {
                    list.add(s);
                }
            }
        }

        return list;
    }
}